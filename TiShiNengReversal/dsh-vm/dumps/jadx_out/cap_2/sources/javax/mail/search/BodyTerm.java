package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BodyTerm extends javax.mail.search.StringTerm {
    private static final long serialVersionUID = -4888862527916911385L;

    public BodyTerm(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean matchPart(javax.mail.Part r5) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "text/*"
            boolean r1 = r5.isMimeType(r1)     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L17
            java.lang.Object r5 = r5.getContent()     // Catch: java.lang.Exception -> L4f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L4f
            if (r5 != 0) goto L12
            return r0
        L12:
            boolean r5 = super.match(r5)     // Catch: java.lang.Exception -> L4f
            return r5
        L17:
            java.lang.String r1 = "multipart/*"
            boolean r1 = r5.isMimeType(r1)     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L3c
            java.lang.Object r5 = r5.getContent()     // Catch: java.lang.Exception -> L4f
            javax.mail.Multipart r5 = (javax.mail.Multipart) r5     // Catch: java.lang.Exception -> L4f
            int r1 = r5.getCount()     // Catch: java.lang.Exception -> L4f
            r2 = 0
        L2a:
            if (r2 < r1) goto L2d
            goto L4f
        L2d:
            javax.mail.BodyPart r3 = r5.getBodyPart(r2)     // Catch: java.lang.Exception -> L4f
            boolean r3 = r4.matchPart(r3)     // Catch: java.lang.Exception -> L4f
            if (r3 == 0) goto L39
            r5 = 1
            return r5
        L39:
            int r2 = r2 + 1
            goto L2a
        L3c:
            java.lang.String r1 = "message/rfc822"
            boolean r1 = r5.isMimeType(r1)     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L4f
            java.lang.Object r5 = r5.getContent()     // Catch: java.lang.Exception -> L4f
            javax.mail.Part r5 = (javax.mail.Part) r5     // Catch: java.lang.Exception -> L4f
            boolean r5 = r4.matchPart(r5)     // Catch: java.lang.Exception -> L4f
            return r5
        L4f:
            return r0
    }

    @Override // javax.mail.search.StringTerm
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.search.BodyTerm
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(javax.mail.Message r1) {
            r0 = this;
            boolean r1 = r0.matchPart(r1)
            return r1
    }
}
