package org.apache.harmony.awt.internal.nls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Messages {
    private static java.util.ResourceBundle bundle;


    static {
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "org.apache.harmony.awt.internal.nls.messages"
            java.util.ResourceBundle r0 = setLocale(r0, r1)     // Catch: java.lang.Throwable -> Lc
            org.apache.harmony.awt.internal.nls.Messages.bundle = r0     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public Messages() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String format(java.lang.String r9, java.lang.Object[] r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r9.length()
            int r2 = r10.length
            int r2 = r2 * 20
            int r1 = r1 + r2
            r0.<init>(r1)
            int r1 = r10.length
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            r4 = 0
        L12:
            int r5 = r10.length
            if (r4 < r5) goto La3
            r5 = 123(0x7b, float:1.72E-43)
        L17:
            int r10 = r9.indexOf(r5, r3)
            if (r10 >= 0) goto L33
            int r10 = r9.length()
            if (r3 >= r10) goto L2e
            int r10 = r9.length()
            java.lang.String r9 = r9.substring(r3, r10)
            r0.append(r9)
        L2e:
            java.lang.String r9 = r0.toString()
            return r9
        L33:
            if (r10 == 0) goto L50
            int r4 = r10 + (-1)
            char r6 = r9.charAt(r4)
            r7 = 92
            if (r6 != r7) goto L50
            r6 = 1
            if (r10 == r6) goto L49
            java.lang.String r3 = r9.substring(r3, r4)
            r0.append(r3)
        L49:
            r0.append(r5)
            int r10 = r10 + 1
        L4e:
            r3 = r10
            goto L17
        L50:
            int r4 = r9.length()
            int r4 = r4 + (-3)
            if (r10 <= r4) goto L68
            int r10 = r9.length()
            java.lang.String r10 = r9.substring(r3, r10)
            r0.append(r10)
            int r10 = r9.length()
            goto L4e
        L68:
            int r4 = r10 + 1
            char r6 = r9.charAt(r4)
            r7 = 10
            int r6 = java.lang.Character.digit(r6, r7)
            byte r6 = (byte) r6
            if (r6 < 0) goto L99
            int r7 = r10 + 2
            char r7 = r9.charAt(r7)
            r8 = 125(0x7d, float:1.75E-43)
            if (r7 == r8) goto L82
            goto L99
        L82:
            java.lang.String r3 = r9.substring(r3, r10)
            r0.append(r3)
            if (r6 < r1) goto L91
            java.lang.String r3 = "<missing argument>"
            r0.append(r3)
            goto L96
        L91:
            r3 = r2[r6]
            r0.append(r3)
        L96:
            int r10 = r10 + 3
            goto L4e
        L99:
            java.lang.String r10 = r9.substring(r3, r4)
            r0.append(r10)
            r3 = r4
            goto L17
        La3:
            r5 = r10[r4]
            if (r5 != 0) goto Lac
            java.lang.String r5 = "<null>"
            r2[r4] = r5
            goto Lb2
        Lac:
            java.lang.String r5 = r5.toString()
            r2[r4] = r5
        Lb2:
            int r4 = r4 + 1
            goto L12
    }

    public static java.lang.String getString(java.lang.String r2) {
            java.util.ResourceBundle r0 = org.apache.harmony.awt.internal.nls.Messages.bundle
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.String r2 = r0.getString(r2)     // Catch: java.util.MissingResourceException -> La
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing message: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String getString(java.lang.String r2, char r3) {
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r2 = getString(r2, r0)
            return r2
    }

    public static java.lang.String getString(java.lang.String r2, int r3) {
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r2 = getString(r2, r0)
            return r2
    }

    public static java.lang.String getString(java.lang.String r2, java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r2 = getString(r2, r0)
            return r2
    }

    public static java.lang.String getString(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r2 = getString(r2, r0)
            return r2
    }

    public static java.lang.String getString(java.lang.String r1, java.lang.Object[] r2) {
            java.util.ResourceBundle r0 = org.apache.harmony.awt.internal.nls.Messages.bundle
            if (r0 == 0) goto L8
            java.lang.String r1 = r0.getString(r1)     // Catch: java.util.MissingResourceException -> L8
        L8:
            java.lang.String r1 = format(r1, r2)
            return r1
    }

    public static java.util.ResourceBundle setLocale(java.util.Locale r2, java.lang.String r3) {
            r0 = 0
            org.apache.harmony.awt.internal.nls.Messages$1 r1 = new org.apache.harmony.awt.internal.nls.Messages$1     // Catch: java.util.MissingResourceException -> Ld
            r1.<init>(r3, r2, r0)     // Catch: java.util.MissingResourceException -> Ld
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r1)     // Catch: java.util.MissingResourceException -> Ld
            java.util.ResourceBundle r2 = (java.util.ResourceBundle) r2     // Catch: java.util.MissingResourceException -> Ld
            return r2
        Ld:
            return r0
    }
}
