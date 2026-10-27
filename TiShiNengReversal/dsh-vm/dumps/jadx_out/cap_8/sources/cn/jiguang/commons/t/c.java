package cn.jiguang.commons.t;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    java.lang.String f1196c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f1197d;

    /* renamed from: e, reason: collision with root package name */
    android.content.ServiceConnection f1198e;

    class a implements android.content.ServiceConnection {
        final /* synthetic */ cn.jiguang.commons.t.c a;

        a(cn.jiguang.commons.t.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                cn.jiguang.commons.t.c r2 = r1.a     // Catch: java.lang.Throwable -> L8
                java.util.concurrent.LinkedBlockingQueue r2 = r2.f1197d     // Catch: java.lang.Throwable -> L8
                r2.put(r3)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "linkedBlockingQueue error: "
                r3.append(r0)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "MsaOpenIDHelper"
                cn.jiguang.commons.w.a.f(r3, r2)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                return
        }
    }

    public c(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "7vqR3nNqKoDAlUrx74tE1g=="
            java.lang.String r0 = cn.jiguang.commons.L.ad.d(r0)
            r2.f1196c = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.f1197d = r0
            cn.jiguang.commons.t.c$a r0 = new cn.jiguang.commons.t.c$a
            r0.<init>(r2)
            r2.f1198e = r0
            r2.a = r3
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r3.f1196c
            java.lang.String r2 = "dYE0CPNDFJTaYbJHvdYTELPkLL9xmlHysh4O1rCwUiLYHLJ6VxirNHcrSo3Xn2UJ"
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)
            r0.setClassName(r1, r2)
            java.lang.String r1 = "AdKS/+o+CvOMDbvCnPWRYS8wCU0Ooy6tyMT0tXjLMUvWRKeDq6D985Ar35mAOPu+"
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.setAction(r1)
            java.lang.String r1 = "iCmt493CpcicRY98bz8pUhEUlhy7cl4p/yoqnN2nlNM="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.putExtra(r1, r4)
            java.lang.String r4 = "iCmt493CpcicRY98bz8pUjI+wbDT5u8oLPJxFa2B2Zg="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L32
            r1 = 1
            r0.putExtra(r4, r1)     // Catch: java.lang.Throwable -> L32
            android.content.Context r4 = r3.a     // Catch: java.lang.Throwable -> L32
            r4.startService(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startMsaklServer error: "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MsaOpenIDHelper"
            cn.jiguang.commons.w.a.f(r0, r4)
            return
    }

    public java.lang.String a() {
            r5 = this;
            java.lang.String r0 = "MsaOpenIDHelper"
            android.content.Context r1 = r5.a     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L5b
            r5.a(r1)     // Catch: java.lang.Throwable -> L5b
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r5.f1196c     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "dYE0CPNDFJTaYbJHvdYTEBK/MhYfAvKlbba3ZFsuZ+on9OG47ABUmhfzcQhqhJOU"
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L5b
            r2.setClassName(r3, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "AdKS/+o+CvOMDbvCnPWRYUnA2ZKRLZpCerAAd95VliYNvOuVTnj4/o7GUNhJXhWl"
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Throwable -> L5b
            r2.setAction(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "iCmt493CpcicRY98bz8pUhEUlhy7cl4p/yoqnN2nlNM="
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Throwable -> L5b
            r2.putExtra(r3, r1)     // Catch: java.lang.Throwable -> L5b
            android.content.Context r1 = r5.a     // Catch: java.lang.Throwable -> L5b
            android.content.ServiceConnection r3 = r5.f1198e     // Catch: java.lang.Throwable -> L5b
            r4 = 1
            boolean r1 = r1.bindService(r2, r3, r4)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L9f
            java.util.concurrent.LinkedBlockingQueue r1 = r5.f1197d     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r1.take()     // Catch: java.lang.Throwable -> L5d
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.commons.t.d r2 = new cn.jiguang.commons.t.d     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r2.a()     // Catch: java.lang.Throwable -> L5d
            r2.c()     // Catch: java.lang.Throwable -> L5d
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L5d
            android.content.ServiceConnection r3 = r5.f1198e     // Catch: java.lang.Throwable -> L5d
            r2.unbindService(r3)     // Catch: java.lang.Throwable -> L5d
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L5b
            android.content.ServiceConnection r3 = r5.f1198e     // Catch: java.lang.Throwable -> L5b
            r2.unbindService(r3)     // Catch: java.lang.Throwable -> L5b
            return r1
        L5b:
            r1 = move-exception
            goto L87
        L5d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "getOAID error: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L7e
            r2.append(r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L7e
            cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.Throwable -> L7e
            android.content.Context r1 = r5.a     // Catch: java.lang.Throwable -> L5b
            android.content.ServiceConnection r2 = r5.f1198e     // Catch: java.lang.Throwable -> L5b
            r1.unbindService(r2)     // Catch: java.lang.Throwable -> L5b
            goto L9f
        L7e:
            r1 = move-exception
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L5b
            android.content.ServiceConnection r3 = r5.f1198e     // Catch: java.lang.Throwable -> L5b
            r2.unbindService(r3)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L87:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get o failed: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r1)
        L9f:
            java.lang.String r0 = ""
            return r0
    }
}
