package x2;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public static final java.lang.String a = null;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = android.os.Build.ID
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "REL"
            java.lang.String r6 = android.os.Build.VERSION.CODENAME
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L25
            java.lang.String r5 = android.os.Build.MODEL
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            java.lang.String r6 = "AppDownloader"
            r0.append(r6)
            if (r2 != 0) goto L35
            java.lang.String r6 = "/"
            r0.append(r6)
            r0.append(r1)
        L35:
            java.lang.String r6 = " (Linux; U; Android"
            r0.append(r6)
            java.lang.String r6 = " "
            if (r2 != 0) goto L44
            r0.append(r6)
            r0.append(r1)
        L44:
            if (r5 != 0) goto L48
            if (r4 != 0) goto L61
        L48:
            java.lang.String r1 = ";"
            r0.append(r1)
            if (r5 == 0) goto L57
            r0.append(r6)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
        L57:
            if (r4 != 0) goto L61
            java.lang.String r1 = " Build/"
            r0.append(r1)
            r0.append(r3)
        L61:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            x2.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }
}
