package cn.jpush.android.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements javax.net.ssl.HostnameVerifier {
    public java.lang.String a;

    public a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
            r1 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "host:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ",checkHost:"
            r3.append(r0)
            java.lang.String r0 = r1.a
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "DefaultHostVerifier"
            cn.jpush.android.helper.Logger.d(r0, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L28
            r2 = 0
            return r2
        L28:
            java.lang.String r3 = r1.a
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            return r2
    }
}
