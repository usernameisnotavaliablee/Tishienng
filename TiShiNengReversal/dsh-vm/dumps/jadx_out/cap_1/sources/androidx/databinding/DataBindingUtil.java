package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DataBindingUtil {
    private static androidx.databinding.DataBindingComponent sDefaultComponent;
    private static androidx.databinding.DataBinderMapper sMapper;

    static {
            androidx.databinding.DataBinderMapperImpl r0 = new androidx.databinding.DataBinderMapperImpl
            r0.<init>()
            androidx.databinding.DataBindingUtil.sMapper = r0
            r0 = 0
            androidx.databinding.DataBindingUtil.sDefaultComponent = r0
            return
    }

    private DataBindingUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static <T extends androidx.databinding.ViewDataBinding> T bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.sDefaultComponent
            androidx.databinding.ViewDataBinding r1 = bind(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static <T extends androidx.databinding.ViewDataBinding> T bind(@androidx.annotation.NonNull android.view.View r3, androidx.databinding.DataBindingComponent r4) {
            androidx.databinding.ViewDataBinding r0 = getBinding(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L38
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            androidx.databinding.DataBinderMapper r2 = androidx.databinding.DataBindingUtil.sMapper
            int r1 = r2.getLayoutId(r1)
            if (r1 == 0) goto L21
            androidx.databinding.DataBinderMapper r0 = androidx.databinding.DataBindingUtil.sMapper
            androidx.databinding.ViewDataBinding r3 = r0.getDataBinder(r4, r3, r1)
            return r3
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "View is not a binding layout. Tag: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L38:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "View is not a binding layout"
            r3.<init>(r4)
            throw r3
    }

    static <T extends androidx.databinding.ViewDataBinding> T bind(androidx.databinding.DataBindingComponent r1, android.view.View r2, int r3) {
            androidx.databinding.DataBinderMapper r0 = androidx.databinding.DataBindingUtil.sMapper
            androidx.databinding.ViewDataBinding r1 = r0.getDataBinder(r1, r2, r3)
            return r1
    }

    static <T extends androidx.databinding.ViewDataBinding> T bind(androidx.databinding.DataBindingComponent r1, android.view.View[] r2, int r3) {
            androidx.databinding.DataBinderMapper r0 = androidx.databinding.DataBindingUtil.sMapper
            androidx.databinding.ViewDataBinding r1 = r0.getDataBinder(r1, r2, r3)
            return r1
    }

    private static <T extends androidx.databinding.ViewDataBinding> T bindToAddedViews(androidx.databinding.DataBindingComponent r4, android.view.ViewGroup r5, int r6, int r7) {
            int r0 = r5.getChildCount()
            int r1 = r0 - r6
            r2 = 1
            if (r1 != r2) goto L13
            int r0 = r0 - r2
            android.view.View r5 = r5.getChildAt(r0)
            androidx.databinding.ViewDataBinding r4 = bind(r4, r5, r7)
            return r4
        L13:
            android.view.View[] r0 = new android.view.View[r1]
            r2 = 0
        L16:
            if (r2 >= r1) goto L23
            int r3 = r2 + r6
            android.view.View r3 = r5.getChildAt(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L16
        L23:
            androidx.databinding.ViewDataBinding r4 = bind(r4, r0, r7)
            return r4
    }

    @androidx.annotation.Nullable
    public static java.lang.String convertBrIdToString(int r1) {
            androidx.databinding.DataBinderMapper r0 = androidx.databinding.DataBindingUtil.sMapper
            java.lang.String r1 = r0.convertBrIdToString(r1)
            return r1
    }

    @androidx.annotation.Nullable
    public static <T extends androidx.databinding.ViewDataBinding> T findBinding(@androidx.annotation.NonNull android.view.View r7) {
        L0:
            r0 = 0
            if (r7 == 0) goto L52
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.getBinding(r7)
            if (r1 == 0) goto La
            return r1
        La:
            java.lang.Object r1 = r7.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L45
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "layout"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L45
            java.lang.String r2 = "_0"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L45
            r2 = 6
            char r2 = r1.charAt(r2)
            r3 = 7
            r4 = 47
            int r3 = r1.indexOf(r4, r3)
            r5 = -1
            if (r2 != r4) goto L36
            if (r3 != r5) goto L45
            goto L44
        L36:
            r6 = 45
            if (r2 != r6) goto L45
            if (r3 == r5) goto L45
            int r3 = r3 + 1
            int r1 = r1.indexOf(r4, r3)
            if (r1 != r5) goto L45
        L44:
            return r0
        L45:
            android.view.ViewParent r7 = r7.getParent()
            boolean r1 = r7 instanceof android.view.View
            if (r1 == 0) goto L50
            android.view.View r7 = (android.view.View) r7
            goto L0
        L50:
            r7 = r0
            goto L0
        L52:
            return r0
    }

    @androidx.annotation.Nullable
    public static <T extends androidx.databinding.ViewDataBinding> T getBinding(@androidx.annotation.NonNull android.view.View r0) {
            androidx.databinding.ViewDataBinding r0 = androidx.databinding.ViewDataBinding.getBinding(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.databinding.DataBindingComponent getDefaultComponent() {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.sDefaultComponent
            return r0
    }

    public static <T extends androidx.databinding.ViewDataBinding> T inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, int r2, @androidx.annotation.Nullable android.view.ViewGroup r3, boolean r4) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.sDefaultComponent
            androidx.databinding.ViewDataBinding r1 = inflate(r1, r2, r3, r4, r0)
            return r1
    }

    public static <T extends androidx.databinding.ViewDataBinding> T inflate(@androidx.annotation.NonNull android.view.LayoutInflater r2, int r3, @androidx.annotation.Nullable android.view.ViewGroup r4, boolean r5, @androidx.annotation.Nullable androidx.databinding.DataBindingComponent r6) {
            r0 = 0
            if (r4 == 0) goto L7
            if (r5 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 == 0) goto Le
            int r0 = r4.getChildCount()
        Le:
            android.view.View r2 = r2.inflate(r3, r4, r5)
            if (r1 == 0) goto L19
            androidx.databinding.ViewDataBinding r2 = bindToAddedViews(r6, r4, r0, r3)
            return r2
        L19:
            androidx.databinding.ViewDataBinding r2 = bind(r6, r2, r3)
            return r2
    }

    public static <T extends androidx.databinding.ViewDataBinding> T setContentView(@androidx.annotation.NonNull android.app.Activity r1, int r2) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.sDefaultComponent
            androidx.databinding.ViewDataBinding r1 = setContentView(r1, r2, r0)
            return r1
    }

    public static <T extends androidx.databinding.ViewDataBinding> T setContentView(@androidx.annotation.NonNull android.app.Activity r1, int r2, @androidx.annotation.Nullable androidx.databinding.DataBindingComponent r3) {
            r1.setContentView(r2)
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            androidx.databinding.ViewDataBinding r1 = bindToAddedViews(r3, r1, r0, r2)
            return r1
    }

    public static void setDefaultComponent(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r0) {
            androidx.databinding.DataBindingUtil.sDefaultComponent = r0
            return
    }
}
