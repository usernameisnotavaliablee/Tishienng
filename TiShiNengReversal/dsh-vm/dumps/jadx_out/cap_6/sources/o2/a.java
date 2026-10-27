package o2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static java.lang.String a(android.content.Context r2) {
            java.lang.String r0 = o2.c.e(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4c
            java.lang.String r0 = o2.b.e(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L15
            return r0
        L15:
            java.lang.String r0 = o2.c.d(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4c
            java.lang.String r0 = o2.b.d(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2a
            return r0
        L2a:
            java.lang.String r0 = o2.b.c(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4c
            java.lang.String r0 = o2.c.c(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3f
            return r0
        L3f:
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            java.lang.String r2 = r2.getDeviceId()
            return r2
        L4c:
            return r0
    }

    private static boolean b(@androidx.annotation.NonNull java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
        L9:
            int r2 = r4.length()
            if (r0 >= r2) goto L1b
            char r2 = r4.charAt(r0)
            r3 = 48
            if (r2 == r3) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto L9
        L1b:
            r4 = 1
            return r4
    }

    public static boolean c(android.content.Context r0) {
            java.lang.String r0 = a(r0)
            boolean r0 = b(r0)
            return r0
    }
}
