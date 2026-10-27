package com.huawei.hmf.tasks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class l<TResult> {
    private final com.huawei.hmf.tasks.a.i<TResult> a;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.huawei.hmf.tasks.l a;

        a(com.huawei.hmf.tasks.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.huawei.hmf.tasks.l r0 = r1.a
                com.huawei.hmf.tasks.a.i r0 = com.huawei.hmf.tasks.l.a(r0)
                r0.B()
                return
        }
    }

    public l() {
            r1 = this;
            r1.<init>()
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            r1.a = r0
            return
    }

    public l(com.huawei.hmf.tasks.b r2) {
            r1 = this;
            r1.<init>()
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            r1.a = r0
            com.huawei.hmf.tasks.l$a r0 = new com.huawei.hmf.tasks.l$a
            r0.<init>(r1)
            r2.b(r0)
            return
    }

    static /* synthetic */ com.huawei.hmf.tasks.a.i a(com.huawei.hmf.tasks.l r0) {
            com.huawei.hmf.tasks.a.i<TResult> r0 = r0.a
            return r0
    }

    public com.huawei.hmf.tasks.k<TResult> b() {
            r1 = this;
            com.huawei.hmf.tasks.a.i<TResult> r0 = r1.a
            return r0
    }

    public void c(java.lang.Exception r2) {
            r1 = this;
            com.huawei.hmf.tasks.a.i<TResult> r0 = r1.a
            r0.z(r2)
            return
    }

    public void setResult(TResult r2) {
            r1 = this;
            com.huawei.hmf.tasks.a.i<TResult> r0 = r1.a
            r0.A(r2)
            return
    }
}
