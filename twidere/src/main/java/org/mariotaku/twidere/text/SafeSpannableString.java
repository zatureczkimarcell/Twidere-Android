package org.mariotaku.twidere.text;

import android.text.SpannableString;

import org.mariotaku.twidere.util.CheckUtils;
import org.mariotaku.twidere.util.TwidereStringUtils;

/**
 * Created by Ningyuan on 2015/5/1.
 */
public class SafeSpannableString extends SpannableString {

    public SafeSpannableString(CharSequence source) {
        super(source);
        TwidereStringUtils.fixSHY(this);
    }

    @Override
    public void setSpan(Object what, int start, int end, int flags) {
        if (!CheckUtils.checkRange(this, start, end)) {
            // Silently ignore
            return;
        }
        super.setSpan(what, start, end, flags);
    }
}
