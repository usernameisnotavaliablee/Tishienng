package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SignatureAlgorithmConverter {
    private static final java.util.regex.Pattern PATTERN = null;

    static {
            java.lang.String r0 = "(?:(^[a-zA-Z].+)With(.+)Encryption$)|(?:(^[a-zA-Z].+)(?:_with_|-with-|_pkcs1_|_pss_rsae_)(.+$))|(?:(^[a-zA-Z].+)_(.+$))"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.SignatureAlgorithmConverter.PATTERN = r0
            return
    }

    private SignatureAlgorithmConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String toJavaName(java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.regex.Pattern r1 = io.netty.handler.ssl.SignatureAlgorithmConverter.PATTERN
            java.util.regex.Matcher r5 = r1.matcher(r5)
            boolean r1 = r5.matches()
            if (r1 == 0) goto L95
            r1 = 1
            java.lang.String r1 = r5.group(r1)
            java.lang.String r2 = "with"
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r3)
            r0.append(r1)
            r0.append(r2)
            r1 = 2
            java.lang.String r5 = r5.group(r1)
            java.lang.String r5 = r5.toUpperCase(r3)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L3b:
            r1 = 3
            java.lang.String r3 = r5.group(r1)
            if (r3 == 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 4
            java.lang.String r3 = r5.group(r3)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r5 = r5.group(r1)
            java.lang.String r5 = r5.toUpperCase(r4)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L68:
            r1 = 5
            java.lang.String r3 = r5.group(r1)
            if (r3 == 0) goto L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 6
            java.lang.String r3 = r5.group(r3)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r5 = r5.group(r1)
            java.lang.String r5 = r5.toUpperCase(r4)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L95:
            return r0
    }
}
