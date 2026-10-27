package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {
    public static final /* synthetic */ java.lang.String a(java.lang.String r0) {
            java.lang.String r0 = b(r0)
            return r0
    }

    private static final java.lang.String b(java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            int r2 = r6.length()
            r3 = 0
        Lf:
            if (r3 >= r2) goto L55
            char r4 = r6.charAt(r3)
            if (r4 != r1) goto L1d
            java.lang.String r4 = "\\\""
            r0.append(r4)
            goto L52
        L1d:
            r5 = 92
            if (r4 != r5) goto L27
            java.lang.String r4 = "\\\\"
            r0.append(r4)
            goto L52
        L27:
            r5 = 8
            if (r4 != r5) goto L31
            java.lang.String r4 = "\\b"
            r0.append(r4)
            goto L52
        L31:
            r5 = 10
            if (r4 != r5) goto L3b
            java.lang.String r4 = "\\n"
            r0.append(r4)
            goto L52
        L3b:
            r5 = 13
            if (r4 != r5) goto L45
            java.lang.String r4 = "\\r"
            r0.append(r4)
            goto L52
        L45:
            r5 = 9
            if (r4 != r5) goto L4f
            java.lang.String r4 = "\\t"
            r0.append(r4)
            goto L52
        L4f:
            r0.append(r4)
        L52:
            int r3 = r3 + 1
            goto Lf
        L55:
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r6, r0)
            return r6
    }
}
