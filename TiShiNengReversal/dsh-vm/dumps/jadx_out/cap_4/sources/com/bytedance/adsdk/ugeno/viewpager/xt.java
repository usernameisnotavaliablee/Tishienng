package com.bytedance.adsdk.ugeno.viewpager;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class xt {
    private final android.database.DataSetObservable j;
    private android.database.DataSetObserver xt;

    public xt() {
            r1 = this;
            r1.<init>()
            android.database.DataSetObservable r0 = new android.database.DataSetObservable
            r0.<init>()
            r1.j = r0
            return
    }

    public void cw() {
            r1 = this;
            monitor-enter(r1)
            android.database.DataSetObserver r0 = r1.xt     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.onChanged()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto L12
        Lb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            android.database.DataSetObservable r0 = r1.j
            r0.notifyChanged()
            return
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public float j(int r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    public abstract int j();

    public int j(java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @java.lang.Deprecated
    public java.lang.Object j(android.view.View r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Required method instantiateItem was not overridden"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.Object j(android.view.ViewGroup r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r0.j(r1, r2)
            return r1
    }

    void j(android.database.DataSetObserver r1) {
            r0 = this;
            monitor-enter(r0)
            r0.xt = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @java.lang.Deprecated
    public void j(android.view.View r1, int r2, java.lang.Object r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Required method destroyItem was not overridden"
            r1.<init>(r2)
            throw r1
    }

    public void j(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.j(r1, r2, r3)
            return
    }

    public abstract boolean j(android.view.View r1, java.lang.Object r2);

    public android.os.Parcelable xt() {
            r1 = this;
            r0 = 0
            return r0
    }
}
