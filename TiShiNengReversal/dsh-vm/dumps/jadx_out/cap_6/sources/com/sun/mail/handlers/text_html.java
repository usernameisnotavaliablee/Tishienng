package com.sun.mail.handlers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class text_html extends com.sun.mail.handlers.text_plain {
    private static javax.activation.ActivationDataFlavor myDF;

    static {
            javax.activation.ActivationDataFlavor r0 = new javax.activation.ActivationDataFlavor
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "HTML String"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0.<init>(r3, r1, r2)
            com.sun.mail.handlers.text_html.myDF = r0
            return
    }

    public text_html() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.sun.mail.handlers.text_plain
    protected javax.activation.ActivationDataFlavor getDF() {
            r1 = this;
            javax.activation.ActivationDataFlavor r0 = com.sun.mail.handlers.text_html.myDF
            return r0
    }
}
