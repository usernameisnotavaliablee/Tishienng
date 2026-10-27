package com.google.common.html;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class HtmlEscapers {
    private static final com.google.common.escape.Escaper HTML_ESCAPER = null;

    static {
            com.google.common.escape.Escapers$Builder r0 = com.google.common.escape.Escapers.builder()
            r1 = 34
            java.lang.String r2 = "&quot;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 39
            java.lang.String r2 = "&#39;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 38
            java.lang.String r2 = "&amp;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 60
            java.lang.String r2 = "&lt;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 62
            java.lang.String r2 = "&gt;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            com.google.common.escape.Escaper r0 = r0.build()
            com.google.common.html.HtmlEscapers.HTML_ESCAPER = r0
            return
    }

    private HtmlEscapers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.escape.Escaper htmlEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.html.HtmlEscapers.HTML_ESCAPER
            return r0
    }
}
