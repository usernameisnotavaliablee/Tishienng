package cn.jiguang.commons.x;

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
    public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
            r0 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r2 = r0.a
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            return r1
    }
}
