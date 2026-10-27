package com.bxkj.student.home.teaching.learning.detail.type;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PdfFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private java.lang.String j;
    private java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    private com.bxkj.base.util.file.a f928l;

    /* renamed from: m, reason: collision with root package name */
    private java.io.File f929m;

    /* renamed from: n, reason: collision with root package name */
    private com.github.barteksc.pdfviewer.PDFView f930n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f931o;

    /* renamed from: p, reason: collision with root package name */
    private android.widget.FrameLayout f932p;

    /* renamed from: q, reason: collision with root package name */
    private com.daimajia.numberprogressbar.NumberProgressBar f933q;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f934r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f935s;

    /* renamed from: t, reason: collision with root package name */
    private io.reactivex.disposables.Disposable f936t;

    /* renamed from: u, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.type.PdfFragment.b f937u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bxkj.base.util.file.a.b {
        final /* synthetic */ com.bxkj.base.util.file.c a;
        final /* synthetic */ io.reactivex.ObservableEmitter b;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.type.PdfFragment c;

        a(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r1, com.bxkj.base.util.file.c r2, io.reactivex.ObservableEmitter r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.util.file.a.b
        public void a(java.io.File r2) {
                r1 = this;
                com.bxkj.base.util.file.c r0 = r1.a
                r0.d(r2)
                io.reactivex.ObservableEmitter r2 = r1.b
                com.bxkj.base.util.file.c r0 = r1.a
                r2.onNext(r0)
                io.reactivex.ObservableEmitter r2 = r1.b
                r2.onComplete()
                return
        }

        @Override // com.bxkj.base.util.file.a.b
        public void b(java.lang.Exception r1) {
                r0 = this;
                return
        }

        @Override // com.bxkj.base.util.file.a.b
        public void c(int r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0 = r1.c
                com.bxkj.student.home.teaching.learning.detail.type.PdfFragment.S(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void onSuccess();
    }

    public PdfFragment() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f934r = r0
            r1.f935s = r0
            return
    }

    public static /* synthetic */ void N(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0, int r1, int r2) {
            r0.X(r1, r2)
            return
    }

    public static /* synthetic */ void O(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0, int r1, java.lang.Integer r2) {
            r0.Z(r1, r2)
            return
    }

    public static /* synthetic */ void P(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0, int r1) {
            r0.Y(r1)
            return
    }

    public static /* synthetic */ void Q(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0, io.reactivex.ObservableEmitter r1) {
            r0.V(r1)
            return
    }

    public static /* synthetic */ void R(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0, com.bxkj.base.util.file.c r1) {
            r0.W(r1)
            return
    }

    static /* bridge */ /* synthetic */ void S(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0, int r1) {
            r0.c0(r1)
            return
    }

    private void T() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.detail.type.d r0 = new com.bxkj.student.home.teaching.learning.detail.type.d
            r0.<init>(r2)
            io.reactivex.Observable r0 = io.reactivex.Observable.create(r0)
            io.reactivex.ObservableTransformer r1 = com.bxkj.base.util.file.d.d()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.bxkj.student.home.teaching.learning.detail.type.e r1 = new com.bxkj.student.home.teaching.learning.detail.type.e
            r1.<init>(r2)
            io.reactivex.disposables.Disposable r0 = r0.subscribe(r1)
            r2.f936t = r0
            return
    }

    private void U(java.lang.String r2) {
            r1 = this;
            r1.f934r = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "aa."
            r2.append(r0)
            java.lang.String r0 = r1.f934r
            java.lang.String r0 = com.bxkj.base.util.file.b.i(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.f935s = r2
            com.bxkj.base.util.file.a r2 = com.bxkj.base.util.file.a.b()
            r1.f928l = r2
            r1.T()
            return
    }

    private /* synthetic */ void V(io.reactivex.ObservableEmitter r7) throws java.lang.Exception {
            r6 = this;
            com.bxkj.base.util.file.c r0 = new com.bxkj.base.util.file.c
            r0.<init>()
            android.content.Context r1 = r6.g
            java.lang.String r1 = com.bxkj.base.util.file.b.e(r1)
            com.bxkj.base.util.file.a r2 = r6.f928l
            java.lang.String r3 = r6.f934r
            java.lang.String r4 = r6.f935s
            com.bxkj.student.home.teaching.learning.detail.type.PdfFragment$a r5 = new com.bxkj.student.home.teaching.learning.detail.type.PdfFragment$a
            r5.<init>(r6, r0, r7)
            r2.a(r3, r1, r4, r5)
            return
    }

    private /* synthetic */ void W(com.bxkj.base.util.file.c r1) throws java.lang.Exception {
            r0 = this;
            r0.b0(r1)
            return
    }

    private /* synthetic */ void X(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.f931o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r3 + 1
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.setText(r3)
            return
    }

    private /* synthetic */ void Y(int r1) {
            r0 = this;
            com.bxkj.student.home.teaching.learning.detail.type.PdfFragment$b r1 = r0.f937u
            if (r1 == 0) goto L7
            r1.onSuccess()
        L7:
            return
    }

    private /* synthetic */ void Z(int r1, java.lang.Integer r2) throws java.lang.Exception {
            r0 = this;
            com.daimajia.numberprogressbar.NumberProgressBar r2 = r0.f933q
            r2.setProgress(r1)
            return
    }

    private void b0(com.bxkj.base.util.file.c r3) {
            r2 = this;
            com.daimajia.numberprogressbar.NumberProgressBar r0 = r2.f933q     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L12
            int r1 = r3.b()     // Catch: java.lang.Exception -> L9a
            r0.setProgress(r1)     // Catch: java.lang.Exception -> L9a
            com.daimajia.numberprogressbar.NumberProgressBar r0 = r2.f933q     // Catch: java.lang.Exception -> L9a
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L9a
        L12:
            java.io.File r3 = r3.a()     // Catch: java.lang.Exception -> L9a
            r2.f929m = r3     // Catch: java.lang.Exception -> L9a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9a
            r3.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = "file.getName().toLowerCase()="
            r3.append(r0)     // Catch: java.lang.Exception -> L9a
            java.io.File r0 = r2.f929m     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Exception -> L9a
            r3.append(r0)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L9a
            com.orhanobut.logger.j.c(r3)     // Catch: java.lang.Exception -> L9a
            java.io.File r3 = r2.f929m     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = "pdf"
            boolean r3 = r3.endsWith(r0)     // Catch: java.lang.Exception -> L9a
            if (r3 == 0) goto L6c
            com.github.barteksc.pdfviewer.PDFView r3 = r2.f930n     // Catch: java.lang.Exception -> L9a
            java.io.File r0 = r2.f929m     // Catch: java.lang.Exception -> L9a
            com.github.barteksc.pdfviewer.PDFView$Configurator r3 = r3.fromFile(r0)     // Catch: java.lang.Exception -> L9a
            r0 = 10
            com.github.barteksc.pdfviewer.PDFView$Configurator r3 = r3.spacing(r0)     // Catch: java.lang.Exception -> L9a
            com.bxkj.student.home.teaching.learning.detail.type.b r0 = new com.bxkj.student.home.teaching.learning.detail.type.b     // Catch: java.lang.Exception -> L9a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L9a
            com.github.barteksc.pdfviewer.PDFView$Configurator r3 = r3.onPageChange(r0)     // Catch: java.lang.Exception -> L9a
            com.bxkj.student.home.teaching.learning.detail.type.c r0 = new com.bxkj.student.home.teaching.learning.detail.type.c     // Catch: java.lang.Exception -> L9a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L9a
            com.github.barteksc.pdfviewer.PDFView$Configurator r3 = r3.onLoad(r0)     // Catch: java.lang.Exception -> L9a
            r3.load()     // Catch: java.lang.Exception -> L9a
            return
        L6c:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L9a
            android.content.Context r0 = r2.g     // Catch: java.lang.Exception -> L9a
            r3.<init>(r0)     // Catch: java.lang.Exception -> L9a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9a
            r0.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = "暂不支持当前文件类型【"
            r0.append(r1)     // Catch: java.lang.Exception -> L9a
            java.io.File r1 = r2.f929m     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = com.bxkj.base.util.file.b.i(r1)     // Catch: java.lang.Exception -> L9a
            r0.append(r1)     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = "】请联系管理员"
            r0.append(r1)     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L9a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)     // Catch: java.lang.Exception -> L9a
            r3.show()     // Catch: java.lang.Exception -> L9a
        L9a:
            return
    }

    private void c0(int r3) {
            r2 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)
            io.reactivex.ObservableTransformer r1 = com.bxkj.base.util.file.d.d()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.bxkj.student.home.teaching.learning.detail.type.a r1 = new com.bxkj.student.home.teaching.learning.detail.type.a
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }

    public void a0(com.bxkj.student.home.teaching.learning.detail.type.PdfFragment.b r1) {
            r0 = this;
            r0.f937u = r1
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public void e() {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "url"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L18
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r3.U(r0)
            return
        L18:
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "filePath"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L43
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r0 = r0.getString(r1)
            com.bxkj.base.util.file.c r1 = new com.bxkj.base.util.file.c
            r1.<init>()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r1.d(r2)
            com.daimajia.numberprogressbar.NumberProgressBar r0 = r3.f933q
            r2 = 8
            r0.setVisibility(r2)
            r3.b0(r1)
        L43:
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298308(0x7f090804, float:1.8214585E38)
            android.view.View r1 = r0.c(r1)
            com.github.barteksc.pdfviewer.PDFView r1 = (com.github.barteksc.pdfviewer.PDFView) r1
            r0.f930n = r1
            r1 = 2131298254(0x7f0907ce, float:1.8214476E38)
            android.view.View r1 = r0.c(r1)
            com.daimajia.numberprogressbar.NumberProgressBar r1 = (com.daimajia.numberprogressbar.NumberProgressBar) r1
            r0.f933q = r1
            r1 = 2131299014(0x7f090ac6, float:1.8216017E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f931o = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131492987(0x7f0c007b, float:1.8609441E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f936t
            if (r0 == 0) goto Lf
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto Lf
            io.reactivex.disposables.Disposable r0 = r1.f936t
            r0.dispose()
        Lf:
            super/*androidx.fragment.app.Fragment*/.onDestroy()
            return
    }
}
