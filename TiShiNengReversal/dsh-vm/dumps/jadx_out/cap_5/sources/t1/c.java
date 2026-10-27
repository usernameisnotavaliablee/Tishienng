package t1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private java.lang.String a;
    private final java.util.Map<java.lang.String, t1.d> b;
    private java.util.List<t1.b> c;

    public c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            r2.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.c = r0
            return
    }

    public java.util.List<t1.b> a() {
            r1 = this;
            java.util.List<t1.b> r0 = r1.c
            return r0
    }

    public t1.d b(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            java.lang.String r2 = "Service"
            java.lang.String r0 = "In servings.getServing(String groupId), the groupId is Empty or null"
            com.huawei.hms.framework.common.Logger.w(r2, r0)
            r2 = 0
            return r2
        Lf:
            java.util.Map<java.lang.String, t1.d> r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            t1.d r2 = (t1.d) r2
            return r2
    }

    public void c(java.lang.String r2, t1.d r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            if (r3 == 0) goto Ld
            java.util.Map<java.lang.String, t1.d> r0 = r1.b
            r0.put(r2, r3)
        Ld:
            return
    }

    public void d(java.util.List<t1.b> r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void f(java.lang.String r1) {
            r0 = this;
            return
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
