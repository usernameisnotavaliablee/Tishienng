package cn.bluemobi.dylan.base.adapter.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

    /* renamed from: d, reason: collision with root package name */
    private android.util.SparseArray<android.view.View> f42d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.View f43e;

    /* renamed from: f, reason: collision with root package name */
    private android.content.Context f44f;

    /* renamed from: g, reason: collision with root package name */
    private int f45g;

    /* renamed from: h, reason: collision with root package name */
    private int f46h;

    public ViewHolder(android.content.Context r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            r0.<init>(r2)
            int r3 = r0.getLayoutPosition()
            r0.f46h = r3
            r0.f44f = r1
            r0.f43e = r2
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f42d = r1
            android.view.View r1 = r0.f43e
            r1.setTag(r0)
            return
    }

    public static cn.bluemobi.dylan.base.adapter.common.ViewHolder a(android.content.Context r1, android.view.View r2, android.view.ViewGroup r3, int r4) {
            if (r2 != 0) goto L13
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = new cn.bluemobi.dylan.base.adapter.common.ViewHolder
            r0.<init>(r1, r2, r3)
            r0.f45g = r4
            return r0
        L13:
            java.lang.Object r1 = r2.getTag()
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = (cn.bluemobi.dylan.base.adapter.common.ViewHolder) r1
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder A(int r1, int r2, int r3) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1.setMax(r3)
            r1.setProgress(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder B(int r1, float r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.RatingBar r1 = (android.widget.RatingBar) r1
            r1.setRating(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder C(int r1, float r2, int r3) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.RatingBar r1 = (android.widget.RatingBar) r1
            r1.setMax(r3)
            r1.setRating(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder D(int r2, java.lang.String r3, int r4) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r0 = r1.f44f
            cn.bluemobi.dylan.base.utils.o.c(r0, r3, r2, r4)
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder E(int r7, java.lang.String r8, int r9, int r10, int r11) {
            r6 = this;
            android.view.View r7 = r6.h(r7)
            r2 = r7
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r0 = r6.f44f
            r1 = r8
            r5 = r9
            r3 = r10
            r4 = r11
            cn.bluemobi.dylan.base.utils.o.d(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder F(int r2, java.lang.String r3) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r0 = r1.f44f
            cn.bluemobi.dylan.base.utils.o.e(r0, r3, r2)
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder G(int r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r0 = r1.f44f
            cn.bluemobi.dylan.base.utils.o.f(r0, r3, r2, r4, r5)
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder H(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setTag(r2, r3)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder I(int r1, java.lang.Object r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setTag(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder J(int r1, java.lang.CharSequence r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder K(int r1, int r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder L(int r2, int r3) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r0 = r1.f44f
            android.content.res.Resources r0 = r0.getResources()
            int r3 = r0.getColor(r3)
            r2.setTextColor(r3)
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder M(android.graphics.Typeface r5, int... r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1b
            r2 = r6[r1]
            android.view.View r2 = r4.h(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setTypeface(r5)
            int r3 = r2.getPaintFlags()
            r3 = r3 | 128(0x80, float:1.8E-43)
            r2.setPaintFlags(r3)
            int r1 = r1 + 1
            goto L2
        L1b:
            return r4
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder N(int r1, boolean r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r1.setVisibility(r2)
            return r0
    }

    public android.view.View b() {
            r1 = this;
            android.view.View r0 = r1.f43e
            return r0
    }

    public boolean c(int r1) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            boolean r1 = r1.isEnabled()
            return r1
    }

    public java.lang.String d(int r1) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            return r1
    }

    public int e() {
            r1 = this;
            int r0 = r1.f45g
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.f46h
            return r0
    }

    public java.lang.String g(int r1) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            return r1
    }

    public <T extends android.view.View> T h(int r3) {
            r2 = this;
            android.util.SparseArray<android.view.View> r0 = r2.f42d
            java.lang.Object r0 = r0.get(r3)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L15
            android.view.View r0 = r2.f43e
            android.view.View r0 = r0.findViewById(r3)
            android.util.SparseArray<android.view.View> r1 = r2.f42d
            r1.put(r3, r0)
        L15:
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder i(int r2) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 15
            android.text.util.Linkify.addLinks(r2, r0)
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public cn.bluemobi.dylan.base.adapter.common.ViewHolder j(int r1, float r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setAlpha(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder k(int r1, int r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setBackgroundColor(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder l(int r1, int r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setBackgroundResource(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder m(int r1, boolean r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.Checkable r1 = (android.widget.Checkable) r1
            r1.setChecked(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder n(int r1, boolean r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setEnabled(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder o(int r1, java.lang.String r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setHint(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder p(int r1, android.graphics.Bitmap r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageBitmap(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder q(int r1, android.graphics.drawable.Drawable r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageDrawable(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder r(int r1, int r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageResource(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder s(int r2, java.lang.String r3) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r0 = r1.f44f
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            com.bumptech.glide.h r3 = r0.M(r3)
            r3.m1(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder t(int r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            android.view.View r2 = r1.h(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r0 = r1.f44f
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            com.bumptech.glide.h r3 = r0.M(r3)
            com.bumptech.glide.request.a r3 = r3.y0(r4)
            com.bumptech.glide.h r3 = (com.bumptech.glide.h) r3
            com.bumptech.glide.request.a r3 = r3.z(r5)
            com.bumptech.glide.h r3 = (com.bumptech.glide.h) r3
            r3.m1(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder u(int r1, int r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1.setMax(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder v(int r1) {
            r0 = this;
            r0.f46h = r1
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder w(int r1, android.view.View.OnClickListener r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setOnClickListener(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder x(int r1, android.view.View.OnLongClickListener r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setOnLongClickListener(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder y(int r1, android.view.View.OnTouchListener r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            r1.setOnTouchListener(r2)
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder z(int r1, int r2) {
            r0 = this;
            android.view.View r1 = r0.h(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1.setProgress(r2)
            return r0
    }
}
