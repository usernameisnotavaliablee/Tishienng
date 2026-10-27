package cn.bluemobi.dylan.photoview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImageDetailFragment extends androidx.fragment.app.Fragment {

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f148c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.ImageView f149d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.ProgressBar f150e;

    /* renamed from: f, reason: collision with root package name */
    private cn.bluemobi.dylan.photoview.library.d f151f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.photoview.library.d.f {
        final /* synthetic */ cn.bluemobi.dylan.photoview.ImageDetailFragment a;

        a(cn.bluemobi.dylan.photoview.ImageDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // cn.bluemobi.dylan.photoview.library.d.f
        public void a(android.view.View r1, float r2, float r3) {
                r0 = this;
                cn.bluemobi.dylan.photoview.ImageDetailFragment r1 = r0.a
                androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bumptech.glide.request.g<android.graphics.drawable.Drawable> {
        final /* synthetic */ cn.bluemobi.dylan.photoview.ImageDetailFragment a;

        b(cn.bluemobi.dylan.photoview.ImageDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(@androidx.annotation.Nullable com.bumptech.glide.load.engine.GlideException r1, java.lang.Object r2, com.bumptech.glide.request.target.p<android.graphics.drawable.Drawable> r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean b(android.graphics.drawable.Drawable r1, java.lang.Object r2, com.bumptech.glide.request.target.p<android.graphics.drawable.Drawable> r3, com.bumptech.glide.load.DataSource r4, boolean r5) {
                r0 = this;
                cn.bluemobi.dylan.photoview.ImageDetailFragment r2 = r0.a
                android.widget.ImageView r2 = cn.bluemobi.dylan.photoview.ImageDetailFragment.b(r2)
                r2.setImageDrawable(r1)
                cn.bluemobi.dylan.photoview.ImageDetailFragment r1 = r0.a
                android.widget.ProgressBar r1 = cn.bluemobi.dylan.photoview.ImageDetailFragment.c(r1)
                r2 = 8
                r1.setVisibility(r2)
                cn.bluemobi.dylan.photoview.ImageDetailFragment r1 = r0.a
                cn.bluemobi.dylan.photoview.library.d r1 = cn.bluemobi.dylan.photoview.ImageDetailFragment.d(r1)
                r1.update()
                r1 = 0
                return r1
        }

        public /* bridge */ /* synthetic */ boolean c(java.lang.Object r1, java.lang.Object r2, com.bumptech.glide.request.target.p r3, com.bumptech.glide.load.DataSource r4, boolean r5) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                boolean r1 = r0.b(r1, r2, r3, r4, r5)
                return r1
        }
    }

    public ImageDetailFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.widget.ImageView b(cn.bluemobi.dylan.photoview.ImageDetailFragment r0) {
            android.widget.ImageView r0 = r0.f149d
            return r0
    }

    static /* synthetic */ android.widget.ProgressBar c(cn.bluemobi.dylan.photoview.ImageDetailFragment r0) {
            android.widget.ProgressBar r0 = r0.f150e
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.photoview.library.d d(cn.bluemobi.dylan.photoview.ImageDetailFragment r0) {
            cn.bluemobi.dylan.photoview.library.d r0 = r0.f151f
            return r0
    }

    public static cn.bluemobi.dylan.photoview.ImageDetailFragment e(java.lang.String r3) {
            cn.bluemobi.dylan.photoview.ImageDetailFragment r0 = new cn.bluemobi.dylan.photoview.ImageDetailFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "url"
            r1.putString(r2, r3)
            r0.setArguments(r1)
            return r0
    }

    public void onActivityCreated(android.os.Bundle r2) {
            r1 = this;
            super.onActivityCreated(r2)
            android.content.Context r2 = r1.getContext()
            com.bumptech.glide.i r2 = com.bumptech.glide.b.D(r2)
            java.lang.String r0 = r1.f148c
            com.bumptech.glide.h r2 = r2.M(r0)
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.b
            com.bumptech.glide.request.a r2 = r2.t(r0)
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            r0 = 1
            com.bumptech.glide.request.a r2 = r2.I0(r0)
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            com.bumptech.glide.request.a r2 = r2.n()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            com.bumptech.glide.request.a r2 = r2.u()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            cn.bluemobi.dylan.photoview.ImageDetailFragment$b r0 = new cn.bluemobi.dylan.photoview.ImageDetailFragment$b
            r0.<init>(r1)
            com.bumptech.glide.h r2 = r2.o1(r0)
            android.widget.ImageView r0 = r1.f149d
            r2.m1(r0)
            return
    }

    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            android.os.Bundle r2 = r1.getArguments()
            if (r2 == 0) goto L14
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r0 = "url"
            java.lang.String r2 = r2.getString(r0)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f148c = r2
            return
    }

    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            int r4 = cn.bluemobi.dylan.photoview.R.layout.image_detail_fragment
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            int r3 = cn.bluemobi.dylan.photoview.R.id.image
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.f149d = r3
            cn.bluemobi.dylan.photoview.library.d r3 = new cn.bluemobi.dylan.photoview.library.d
            android.widget.ImageView r4 = r1.f149d
            r3.<init>(r4)
            r1.f151f = r3
            cn.bluemobi.dylan.photoview.ImageDetailFragment$a r4 = new cn.bluemobi.dylan.photoview.ImageDetailFragment$a
            r4.<init>(r1)
            r3.setOnPhotoTapListener(r4)
            int r3 = cn.bluemobi.dylan.photoview.R.id.loading
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r1.f150e = r3
            return r2
    }

    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }
}
