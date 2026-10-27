package com.bxkj.base.v2.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ProgressDialogFragment extends androidx.fragment.app.DialogFragment {

    @org.jetbrains.annotations.Nullable
    private java.lang.String c;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer d;

    @org.jetbrains.annotations.Nullable
    private android.content.DialogInterface.OnKeyListener e;

    @org.jetbrains.annotations.NotNull
    private java.lang.String f;

    @org.jetbrains.annotations.Nullable
    private android.widget.TextView g;

    public ProgressDialogFragment() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public ProgressDialogFragment(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            java.lang.String r1 = "Loading..."
            r0.f = r1
            return
    }

    public /* synthetic */ ProgressDialogFragment(java.lang.String r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "loading"
        L6:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void f(com.bxkj.base.v2.base.ProgressDialogFragment r0, androidx.fragment.app.FragmentManager r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.d(r1, r2, r3)
            return
    }

    public static /* synthetic */ void g(com.bxkj.base.v2.base.ProgressDialogFragment r0, androidx.fragment.app.FragmentManager r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.e(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final android.content.DialogInterface.OnKeyListener b() {
            r1 = this;
            android.content.DialogInterface$OnKeyListener r0 = r1.e
            return r0
    }

    public final void c(@org.jetbrains.annotations.Nullable android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public final void d(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "fragmentManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.d = r3
            r1.setCancelable(r4)
            java.lang.String r3 = "TSNProgressDialogFragment"
            r1.show(r2, r3)
            return
    }

    public final void e(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r2, @org.jetbrains.annotations.Nullable java.lang.String r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "fragmentManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isDestroyed()     // Catch: java.lang.Exception -> L33
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            r1.c = r3     // Catch: java.lang.Exception -> L33
            r1.setCancelable(r4)     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L1c
            r1.f = r3     // Catch: java.lang.Exception -> L33
            android.widget.TextView r4 = r1.g     // Catch: java.lang.Exception -> L33
            if (r4 == 0) goto L1c
            r4.setText(r3)     // Catch: java.lang.Exception -> L33
        L1c:
            boolean r3 = r1.isAdded()     // Catch: java.lang.Exception -> L33
            if (r3 != 0) goto L33
            boolean r3 = r1.isVisible()     // Catch: java.lang.Exception -> L33
            if (r3 != 0) goto L33
            boolean r3 = r1.isRemoving()     // Catch: java.lang.Exception -> L33
            if (r3 != 0) goto L33
            java.lang.String r3 = "TSNProgressDialogFragment"
            r1.showNow(r2, r3)     // Catch: java.lang.Exception -> L33
        L33:
            return
    }

    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            r2 = 1
            int r0 = com.bxkj.base.R.style.loadingDialogStyle
            r1.setStyle(r2, r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup r3, @org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r1 = this;
            java.lang.String r4 = "inflater"
            kotlin.jvm.internal.g0.p(r2, r4)
            int r4 = com.bxkj.base.R.layout.fragment_progress_dialog
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            return r2
    }

    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.Nullable android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r2, r0)
            super/*androidx.fragment.app.Fragment*/.onViewCreated(r2, r3)
            int r3 = com.bxkj.base.R.id.tv_msg
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.g = r2
            if (r2 == 0) goto L1b
            if (r2 == 0) goto L1b
            java.lang.String r3 = r1.f
            r2.setText(r3)
        L1b:
            android.app.Dialog r2 = r1.getDialog()
            if (r2 == 0) goto L26
            android.content.DialogInterface$OnKeyListener r3 = r1.e
            r2.setOnKeyListener(r3)
        L26:
            android.app.Dialog r2 = r1.getDialog()
            if (r2 == 0) goto L30
            r3 = 0
            r2.setCanceledOnTouchOutside(r3)
        L30:
            return
    }
}
