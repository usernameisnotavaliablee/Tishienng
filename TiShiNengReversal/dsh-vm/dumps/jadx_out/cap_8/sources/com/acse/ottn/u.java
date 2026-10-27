package com.acse.ottn;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class u<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> implements com.acse.ottn.t1<T, VH> {
    public java.util.List<T> a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.b3 f2801b;

    /* renamed from: c, reason: collision with root package name */
    public VH f2802c;

    /* renamed from: d, reason: collision with root package name */
    public int f2803d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.u f2804b;

        public a(com.acse.ottn.u r1, int r2) {
                r0 = this;
                r0.f2804b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.acse.ottn.u r3 = r2.f2804b
                com.acse.ottn.b3 r3 = com.acse.ottn.u.a(r3)
                com.acse.ottn.u r0 = r2.f2804b
                java.util.List<T> r0 = r0.a
                int r1 = r2.a
                java.lang.Object r0 = r0.get(r1)
                int r1 = r2.a
                r3.a(r0, r1)
                return
        }
    }

    public u(java.util.List<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r0 = 2
            r1.f2803d = r0
            r1.a(r2)
            return
    }

    public static /* synthetic */ com.acse.ottn.b3 a(com.acse.ottn.u r0) {
            com.acse.ottn.b3 r0 = r0.f2801b
            return r0
    }

    public int a() {
            r1 = this;
            java.util.List<T> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public T a(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public void a(com.acse.ottn.b3 r1) {
            r0 = this;
            r0.f2801b = r1
            return
    }

    public void a(java.util.List<T> r1) {
            r0 = this;
            if (r1 != 0) goto L7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L7:
            r0.a = r1
            return
    }

    public int b(int r3) {
            r2 = this;
            int r0 = r2.f2803d
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            int r1 = r2.a()
            int r3 = com.acse.ottn.z.a(r0, r3, r1)
            return r3
    }

    public VH b() {
            r1 = this;
            VH extends androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.f2802c
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0.f2803d = r1
            return
    }

    public int getItemCount() {
            r2 = this;
            int r0 = r2.a()
            r1 = 1
            if (r0 <= r1) goto Lf
            int r0 = r2.a()
            int r1 = r2.f2803d
            int r0 = r0 + r1
            return r0
        Lf:
            int r0 = r2.a()
            return r0
    }

    public final void onBindViewHolder(@androidx.annotation.NonNull VH r3, int r4) {
            r2 = this;
            r2.f2802c = r3
            int r4 = r2.b(r4)
            java.util.List<T> r0 = r2.a
            java.lang.Object r0 = r0.get(r4)
            int r1 = r2.a()
            r2.a(r3, r0, r4, r1)
            com.acse.ottn.b3 r0 = r2.f2801b
            if (r0 == 0) goto L21
            android.view.View r3 = r3.itemView
            com.acse.ottn.u$a r0 = new com.acse.ottn.u$a
            r0.<init>(r2, r4)
            r3.setOnClickListener(r0)
        L21:
            return
    }

    @androidx.annotation.NonNull
    public VH onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r0.a(r1, r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
            return r1
    }
}
