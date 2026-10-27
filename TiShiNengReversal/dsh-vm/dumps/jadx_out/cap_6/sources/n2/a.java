package n2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r3) {
            java.lang.String r0 = "android_id"
            java.lang.String r1 = n2.b.b(r3, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L20
            java.lang.String r1 = n2.b.a(r3, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L17
            return r1
        L17:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r0)
            return r3
        L20:
            return r1
    }
}
