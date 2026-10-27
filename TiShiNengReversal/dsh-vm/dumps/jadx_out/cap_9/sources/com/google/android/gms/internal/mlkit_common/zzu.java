package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzu {
    public zzu() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String zza(@javax.annotation.CheckForNull java.lang.String r10, @javax.annotation.CheckForNull java.lang.Object... r11) {
            r1 = 0
            r2 = 0
        L2:
            int r0 = r11.length
            if (r2 >= r0) goto L77
            r3 = r11[r2]
            if (r3 != 0) goto Lc
            java.lang.String r0 = "null"
            goto L72
        Lc:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L11
            goto L72
        L11:
            r0 = move-exception
            r8 = r0
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "@"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            java.lang.String r3 = "com.google.common.base.Strings"
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r6 = "lenientToString"
            java.lang.String r5 = "Exception during lenientFormat for "
            java.lang.String r7 = r5.concat(r0)
            java.lang.String r5 = "com.google.common.base.Strings"
            r3.logp(r4, r5, r6, r7, r8)
            java.lang.Class r3 = r8.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "<"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " threw "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ">"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L72:
            r11[r2] = r0
            int r2 = r2 + 1
            goto L2
        L77:
            int r2 = r10.length()
            int r0 = r0 * 16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r0
            r3.<init>(r2)
            r0 = 0
        L84:
            int r2 = r11.length
            if (r1 >= r2) goto La1
            java.lang.String r4 = "%s"
            int r4 = r10.indexOf(r4, r0)
            r5 = -1
            if (r4 != r5) goto L91
            goto La1
        L91:
            r3.append(r10, r0, r4)
            int r0 = r1 + 1
            r1 = r11[r1]
            r3.append(r1)
            int r1 = r4 + 2
            r9 = r1
            r1 = r0
            r0 = r9
            goto L84
        La1:
            int r4 = r10.length()
            r3.append(r10, r0, r4)
            if (r1 >= r2) goto Lcc
            java.lang.String r10 = " ["
            r3.append(r10)
            int r10 = r1 + 1
            r0 = r11[r1]
            r3.append(r0)
        Lb6:
            int r0 = r11.length
            if (r10 >= r0) goto Lc7
            java.lang.String r0 = ", "
            r3.append(r0)
            int r0 = r10 + 1
            r10 = r11[r10]
            r3.append(r10)
            r10 = r0
            goto Lb6
        Lc7:
            r10 = 93
            r3.append(r10)
        Lcc:
            java.lang.String r10 = r3.toString()
            return r10
    }

    public static java.lang.String zzb(@javax.annotation.CheckForNull java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }
}
