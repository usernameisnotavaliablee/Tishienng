package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MyGallery extends android.widget.Gallery implements android.widget.AdapterView.OnItemSelectedListener {
    private static final int timerAnimation = 1;
    private boolean autoPlay;
    private int count;
    private android.widget.LinearLayout ll_focus_indicator_container;
    private final android.os.Handler mHandler;
    private int preSelImgIndex;
    private final java.util.TimerTask task;
    private final java.util.Timer timer;



    public MyGallery(android.content.Context r8) {
            r7 = this;
            r7.<init>(r8)
            r8 = 0
            r7.preSelImgIndex = r8
            cn.bluemobi.dylan.base.view.MyGallery$1 r0 = new cn.bluemobi.dylan.base.view.MyGallery$1
            r0.<init>(r7)
            r7.mHandler = r0
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r7.timer = r1
            cn.bluemobi.dylan.base.view.MyGallery$2 r2 = new cn.bluemobi.dylan.base.view.MyGallery$2
            r2.<init>(r7)
            r7.task = r2
            r0 = 1
            r7.autoPlay = r0
            r7.count = r8
            r3 = 3000(0xbb8, double:1.482E-320)
            r5 = 3000(0xbb8, double:1.482E-320)
            r1.schedule(r2, r3, r5)
            return
    }

    public MyGallery(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>(r7, r8)
            r7 = 0
            r6.preSelImgIndex = r7
            cn.bluemobi.dylan.base.view.MyGallery$1 r8 = new cn.bluemobi.dylan.base.view.MyGallery$1
            r8.<init>(r6)
            r6.mHandler = r8
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r6.timer = r0
            cn.bluemobi.dylan.base.view.MyGallery$2 r1 = new cn.bluemobi.dylan.base.view.MyGallery$2
            r1.<init>(r6)
            r6.task = r1
            r8 = 1
            r6.autoPlay = r8
            r6.count = r7
            r2 = 3000(0xbb8, double:1.482E-320)
            r4 = 3000(0xbb8, double:1.482E-320)
            r0.schedule(r1, r2, r4)
            return
    }

    public MyGallery(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r7 = 0
            r6.preSelImgIndex = r7
            cn.bluemobi.dylan.base.view.MyGallery$1 r8 = new cn.bluemobi.dylan.base.view.MyGallery$1
            r8.<init>(r6)
            r6.mHandler = r8
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r6.timer = r0
            cn.bluemobi.dylan.base.view.MyGallery$2 r1 = new cn.bluemobi.dylan.base.view.MyGallery$2
            r1.<init>(r6)
            r6.task = r1
            r8 = 1
            r6.autoPlay = r8
            r6.count = r7
            r2 = 3000(0xbb8, double:1.482E-320)
            r4 = 3000(0xbb8, double:1.482E-320)
            r0.schedule(r1, r2, r4)
            r6.init()
            return
    }

    private void InitFocusIndicatorContainer() {
            r5 = this;
            android.widget.LinearLayout r0 = r5.ll_focus_indicator_container
            r0.removeAllViews()
            int r0 = r5.count
            if (r0 != 0) goto Ld
            r5.destroy()
            return
        Ld:
            r1 = 1
            if (r0 != r1) goto L13
            r5.destroy()
        L13:
            r0 = 0
            r1 = 0
        L15:
            int r2 = r5.count
            if (r1 >= r2) goto L58
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r2.setId(r1)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY
            r2.setScaleType(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r4
            r4 = 10
            r3.setMargins(r4, r4, r4, r4)
            r2.setLayoutParams(r3)
            r2.setPadding(r0, r0, r0, r0)
            android.content.Context r3 = r5.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = cn.bluemobi.dylan.base.R.drawable.pub_dot_normal
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            r2.setImageDrawable(r3)
            android.widget.LinearLayout r3 = r5.ll_focus_indicator_container
            r3.addView(r2)
            int r1 = r1 + 1
            goto L15
        L58:
            return
    }

    static /* synthetic */ boolean access$000(cn.bluemobi.dylan.base.view.MyGallery r0) {
            boolean r0 = r0.autoPlay
            return r0
    }

    static /* synthetic */ android.os.Handler access$100(cn.bluemobi.dylan.base.view.MyGallery r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    static /* synthetic */ java.util.Timer access$200(cn.bluemobi.dylan.base.view.MyGallery r0) {
            java.util.Timer r0 = r0.timer
            return r0
    }

    private void init() {
            r0 = this;
            return
    }

    private boolean isScrollingLeft(android.view.MotionEvent r1, android.view.MotionEvent r2) {
            r0 = this;
            float r2 = r2.getX()
            float r1 = r1.getX()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public void destroy() {
            r2 = this;
            java.util.Timer r0 = r2.timer
            r0.cancel()
            android.os.Handler r0 = r2.mHandler
            java.util.TimerTask r1 = r2.task
            r0.removeCallbacks(r1)
            return
    }

    public void init(int r1, android.widget.LinearLayout r2) {
            r0 = this;
            r0.count = r1
            r0.ll_focus_indicator_container = r2
            r0.InitFocusIndicatorContainer()
            r0.setOnItemSelectedListener(r0)
            return
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            boolean r1 = r0.isScrollingLeft(r1, r2)
            if (r1 == 0) goto L9
            r1 = 21
            goto Lb
        L9:
            r1 = 22
        Lb:
            r2 = 0
            r0.onKeyDown(r1, r2)
            r1 = 1
            return r1
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            int r1 = r0.count
            if (r1 != 0) goto L5
            goto L12
        L5:
            int r3 = r3 % r1
            android.widget.LinearLayout r1 = r0.ll_focus_indicator_container
            int r2 = r0.preSelImgIndex
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 != 0) goto L13
        L12:
            return
        L13:
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r4 = cn.bluemobi.dylan.base.R.drawable.pub_dot_normal
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)
            r1.setImageDrawable(r2)
            android.widget.LinearLayout r1 = r0.ll_focus_indicator_container
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r4 = cn.bluemobi.dylan.base.R.drawable.pub_dot_focus
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)
            r1.setImageDrawable(r2)
            r0.preSelImgIndex = r3
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void setAutoPlay(boolean r1) {
            r0 = this;
            r0.autoPlay = r1
            return
    }
}
