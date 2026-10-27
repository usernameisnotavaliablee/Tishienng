package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PDFView extends android.widget.RelativeLayout {
    public static final float DEFAULT_MAX_SCALE = 3.0f;
    public static final float DEFAULT_MID_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 1.0f;
    private static final java.lang.String TAG = "PDFView";
    private com.github.barteksc.pdfviewer.AnimationManager animationManager;
    private boolean annotationRendering;
    private android.graphics.PaintFlagsDrawFilter antialiasFilter;
    private boolean autoSpacing;
    private boolean bestQuality;
    com.github.barteksc.pdfviewer.CacheManager cacheManager;
    com.github.barteksc.pdfviewer.listener.Callbacks callbacks;
    private int currentPage;
    private float currentXOffset;
    private float currentYOffset;
    private android.graphics.Paint debugPaint;
    private com.github.barteksc.pdfviewer.DecodingAsyncTask decodingAsyncTask;
    private int defaultPage;
    private boolean doubletapEnabled;
    private com.github.barteksc.pdfviewer.DragPinchManager dragPinchManager;
    private boolean enableAntialiasing;
    private boolean enableSwipe;
    private boolean fitEachPage;
    private boolean hasSize;
    private boolean isScrollHandleInit;
    private float maxZoom;
    private float midZoom;
    private float minZoom;
    private boolean nightMode;
    private java.util.List<java.lang.Integer> onDrawPagesNums;
    private com.github.barteksc.pdfviewer.util.FitPolicy pageFitPolicy;
    private boolean pageFling;
    private boolean pageSnap;
    private com.github.barteksc.pdfviewer.PagesLoader pagesLoader;
    private android.graphics.Paint paint;
    com.github.barteksc.pdfviewer.PdfFile pdfFile;
    private com.shockwave.pdfium.PdfiumCore pdfiumCore;
    private boolean recycled;
    private boolean renderDuringScale;
    com.github.barteksc.pdfviewer.RenderingHandler renderingHandler;
    private android.os.HandlerThread renderingHandlerThread;
    private com.github.barteksc.pdfviewer.PDFView.ScrollDir scrollDir;
    private com.github.barteksc.pdfviewer.scroll.ScrollHandle scrollHandle;
    private int spacingPx;
    private com.github.barteksc.pdfviewer.PDFView.State state;
    private boolean swipeVertical;
    private com.github.barteksc.pdfviewer.PDFView.Configurator waitingDocumentConfigurator;
    private float zoom;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.barteksc.pdfviewer.PDFView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class Configurator {
        private boolean annotationRendering;
        private boolean antialiasing;
        private boolean autoSpacing;
        private int defaultPage;
        private final com.github.barteksc.pdfviewer.source.DocumentSource documentSource;
        private boolean enableDoubletap;
        private boolean enableSwipe;
        private boolean fitEachPage;
        private com.github.barteksc.pdfviewer.link.LinkHandler linkHandler;
        private boolean nightMode;
        private com.github.barteksc.pdfviewer.listener.OnDrawListener onDrawAllListener;
        private com.github.barteksc.pdfviewer.listener.OnDrawListener onDrawListener;
        private com.github.barteksc.pdfviewer.listener.OnErrorListener onErrorListener;
        private com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener onLoadCompleteListener;
        private com.github.barteksc.pdfviewer.listener.OnLongPressListener onLongPressListener;
        private com.github.barteksc.pdfviewer.listener.OnPageChangeListener onPageChangeListener;
        private com.github.barteksc.pdfviewer.listener.OnPageErrorListener onPageErrorListener;
        private com.github.barteksc.pdfviewer.listener.OnPageScrollListener onPageScrollListener;
        private com.github.barteksc.pdfviewer.listener.OnRenderListener onRenderListener;
        private com.github.barteksc.pdfviewer.listener.OnTapListener onTapListener;
        private com.github.barteksc.pdfviewer.util.FitPolicy pageFitPolicy;
        private boolean pageFling;
        private int[] pageNumbers;
        private boolean pageSnap;
        private java.lang.String password;
        private com.github.barteksc.pdfviewer.scroll.ScrollHandle scrollHandle;
        private int spacing;
        private boolean swipeHorizontal;
        final /* synthetic */ com.github.barteksc.pdfviewer.PDFView this$0;

        private Configurator(com.github.barteksc.pdfviewer.PDFView r4, com.github.barteksc.pdfviewer.source.DocumentSource r5) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                r0 = 0
                r3.pageNumbers = r0
                r1 = 1
                r3.enableSwipe = r1
                r3.enableDoubletap = r1
                com.github.barteksc.pdfviewer.link.DefaultLinkHandler r2 = new com.github.barteksc.pdfviewer.link.DefaultLinkHandler
                r2.<init>(r4)
                r3.linkHandler = r2
                r4 = 0
                r3.defaultPage = r4
                r3.swipeHorizontal = r4
                r3.annotationRendering = r4
                r3.password = r0
                r3.scrollHandle = r0
                r3.antialiasing = r1
                r3.spacing = r4
                r3.autoSpacing = r4
                com.github.barteksc.pdfviewer.util.FitPolicy r0 = com.github.barteksc.pdfviewer.util.FitPolicy.WIDTH
                r3.pageFitPolicy = r0
                r3.fitEachPage = r4
                r3.pageFling = r4
                r3.pageSnap = r4
                r3.nightMode = r4
                r3.documentSource = r5
                return
        }

        /* synthetic */ Configurator(com.github.barteksc.pdfviewer.PDFView r1, com.github.barteksc.pdfviewer.source.DocumentSource r2, com.github.barteksc.pdfviewer.PDFView.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator autoSpacing(boolean r1) {
                r0 = this;
                r0.autoSpacing = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator defaultPage(int r1) {
                r0 = this;
                r0.defaultPage = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator disableLongpress() {
                r1 = this;
                com.github.barteksc.pdfviewer.PDFView r0 = r1.this$0
                com.github.barteksc.pdfviewer.DragPinchManager r0 = com.github.barteksc.pdfviewer.PDFView.access$100(r0)
                r0.disableLongpress()
                return r1
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator enableAnnotationRendering(boolean r1) {
                r0 = this;
                r0.annotationRendering = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator enableAntialiasing(boolean r1) {
                r0 = this;
                r0.antialiasing = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator enableDoubletap(boolean r1) {
                r0 = this;
                r0.enableDoubletap = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator enableSwipe(boolean r1) {
                r0 = this;
                r0.enableSwipe = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator fitEachPage(boolean r1) {
                r0 = this;
                r0.fitEachPage = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator linkHandler(com.github.barteksc.pdfviewer.link.LinkHandler r1) {
                r0 = this;
                r0.linkHandler = r1
                return r0
        }

        public void load() {
                r4 = this;
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r0 = com.github.barteksc.pdfviewer.PDFView.access$200(r0)
                if (r0 != 0) goto Le
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.PDFView.access$302(r0, r4)
                return
            Le:
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                r0.recycle()
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener r1 = r4.onLoadCompleteListener
                r0.setOnLoadComplete(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnErrorListener r1 = r4.onErrorListener
                r0.setOnError(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnDrawListener r1 = r4.onDrawListener
                r0.setOnDraw(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnDrawListener r1 = r4.onDrawAllListener
                r0.setOnDrawAll(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnPageChangeListener r1 = r4.onPageChangeListener
                r0.setOnPageChange(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnPageScrollListener r1 = r4.onPageScrollListener
                r0.setOnPageScroll(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnRenderListener r1 = r4.onRenderListener
                r0.setOnRender(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnTapListener r1 = r4.onTapListener
                r0.setOnTap(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnLongPressListener r1 = r4.onLongPressListener
                r0.setOnLongPress(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.listener.OnPageErrorListener r1 = r4.onPageErrorListener
                r0.setOnPageError(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
                com.github.barteksc.pdfviewer.link.LinkHandler r1 = r4.linkHandler
                r0.setLinkHandler(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.enableSwipe
                r0.setSwipeEnabled(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.nightMode
                r0.setNightMode(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.enableDoubletap
                r0.enableDoubletap(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                int r1 = r4.defaultPage
                com.github.barteksc.pdfviewer.PDFView.access$400(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.swipeHorizontal
                r1 = r1 ^ 1
                com.github.barteksc.pdfviewer.PDFView.access$500(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.annotationRendering
                r0.enableAnnotationRendering(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.scroll.ScrollHandle r1 = r4.scrollHandle
                com.github.barteksc.pdfviewer.PDFView.access$600(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.antialiasing
                r0.enableAntialiasing(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                int r1 = r4.spacing
                com.github.barteksc.pdfviewer.PDFView.access$700(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.autoSpacing
                com.github.barteksc.pdfviewer.PDFView.access$800(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = r4.pageFitPolicy
                com.github.barteksc.pdfviewer.PDFView.access$900(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.fitEachPage
                com.github.barteksc.pdfviewer.PDFView.access$1000(r0, r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.pageSnap
                r0.setPageSnap(r1)
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                boolean r1 = r4.pageFling
                r0.setPageFling(r1)
                int[] r0 = r4.pageNumbers
                if (r0 == 0) goto Le8
                com.github.barteksc.pdfviewer.PDFView r1 = r4.this$0
                com.github.barteksc.pdfviewer.source.DocumentSource r2 = r4.documentSource
                java.lang.String r3 = r4.password
                com.github.barteksc.pdfviewer.PDFView.access$1100(r1, r2, r3, r0)
                return
            Le8:
                com.github.barteksc.pdfviewer.PDFView r0 = r4.this$0
                com.github.barteksc.pdfviewer.source.DocumentSource r1 = r4.documentSource
                java.lang.String r2 = r4.password
                com.github.barteksc.pdfviewer.PDFView.access$1200(r0, r1, r2)
                return
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator nightMode(boolean r1) {
                r0 = this;
                r0.nightMode = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onDraw(com.github.barteksc.pdfviewer.listener.OnDrawListener r1) {
                r0 = this;
                r0.onDrawListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onDrawAll(com.github.barteksc.pdfviewer.listener.OnDrawListener r1) {
                r0 = this;
                r0.onDrawAllListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onError(com.github.barteksc.pdfviewer.listener.OnErrorListener r1) {
                r0 = this;
                r0.onErrorListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onLoad(com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener r1) {
                r0 = this;
                r0.onLoadCompleteListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onLongPress(com.github.barteksc.pdfviewer.listener.OnLongPressListener r1) {
                r0 = this;
                r0.onLongPressListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onPageChange(com.github.barteksc.pdfviewer.listener.OnPageChangeListener r1) {
                r0 = this;
                r0.onPageChangeListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onPageError(com.github.barteksc.pdfviewer.listener.OnPageErrorListener r1) {
                r0 = this;
                r0.onPageErrorListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onPageScroll(com.github.barteksc.pdfviewer.listener.OnPageScrollListener r1) {
                r0 = this;
                r0.onPageScrollListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onRender(com.github.barteksc.pdfviewer.listener.OnRenderListener r1) {
                r0 = this;
                r0.onRenderListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator onTap(com.github.barteksc.pdfviewer.listener.OnTapListener r1) {
                r0 = this;
                r0.onTapListener = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator pageFitPolicy(com.github.barteksc.pdfviewer.util.FitPolicy r1) {
                r0 = this;
                r0.pageFitPolicy = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator pageFling(boolean r1) {
                r0 = this;
                r0.pageFling = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator pageSnap(boolean r1) {
                r0 = this;
                r0.pageSnap = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator pages(int... r1) {
                r0 = this;
                r0.pageNumbers = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator password(java.lang.String r1) {
                r0 = this;
                r0.password = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator scrollHandle(com.github.barteksc.pdfviewer.scroll.ScrollHandle r1) {
                r0 = this;
                r0.scrollHandle = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator spacing(int r1) {
                r0 = this;
                r0.spacing = r1
                return r0
        }

        public com.github.barteksc.pdfviewer.PDFView.Configurator swipeHorizontal(boolean r1) {
                r0 = this;
                r0.swipeHorizontal = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum ScrollDir extends java.lang.Enum<com.github.barteksc.pdfviewer.PDFView.ScrollDir> {
        private static final /* synthetic */ com.github.barteksc.pdfviewer.PDFView.ScrollDir[] $VALUES = null;
        public static final com.github.barteksc.pdfviewer.PDFView.ScrollDir END = null;
        public static final com.github.barteksc.pdfviewer.PDFView.ScrollDir NONE = null;
        public static final com.github.barteksc.pdfviewer.PDFView.ScrollDir START = null;

        static {
                com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = new com.github.barteksc.pdfviewer.PDFView$ScrollDir
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.barteksc.pdfviewer.PDFView.ScrollDir.NONE = r0
                com.github.barteksc.pdfviewer.PDFView$ScrollDir r1 = new com.github.barteksc.pdfviewer.PDFView$ScrollDir
                java.lang.String r3 = "START"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.barteksc.pdfviewer.PDFView.ScrollDir.START = r1
                com.github.barteksc.pdfviewer.PDFView$ScrollDir r3 = new com.github.barteksc.pdfviewer.PDFView$ScrollDir
                java.lang.String r5 = "END"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.barteksc.pdfviewer.PDFView.ScrollDir.END = r3
                r5 = 3
                com.github.barteksc.pdfviewer.PDFView$ScrollDir[] r5 = new com.github.barteksc.pdfviewer.PDFView.ScrollDir[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.github.barteksc.pdfviewer.PDFView.ScrollDir.$VALUES = r5
                return
        }

        ScrollDir(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.barteksc.pdfviewer.PDFView.ScrollDir valueOf(java.lang.String r1) {
                java.lang.Class<com.github.barteksc.pdfviewer.PDFView$ScrollDir> r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.barteksc.pdfviewer.PDFView$ScrollDir r1 = (com.github.barteksc.pdfviewer.PDFView.ScrollDir) r1
                return r1
        }

        public static com.github.barteksc.pdfviewer.PDFView.ScrollDir[] values() {
                com.github.barteksc.pdfviewer.PDFView$ScrollDir[] r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.barteksc.pdfviewer.PDFView$ScrollDir[] r0 = (com.github.barteksc.pdfviewer.PDFView.ScrollDir[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<com.github.barteksc.pdfviewer.PDFView.State> {
        private static final /* synthetic */ com.github.barteksc.pdfviewer.PDFView.State[] $VALUES = null;
        public static final com.github.barteksc.pdfviewer.PDFView.State DEFAULT = null;
        public static final com.github.barteksc.pdfviewer.PDFView.State ERROR = null;
        public static final com.github.barteksc.pdfviewer.PDFView.State LOADED = null;
        public static final com.github.barteksc.pdfviewer.PDFView.State SHOWN = null;

        static {
                com.github.barteksc.pdfviewer.PDFView$State r0 = new com.github.barteksc.pdfviewer.PDFView$State
                java.lang.String r1 = "DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.barteksc.pdfviewer.PDFView.State.DEFAULT = r0
                com.github.barteksc.pdfviewer.PDFView$State r1 = new com.github.barteksc.pdfviewer.PDFView$State
                java.lang.String r3 = "LOADED"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.barteksc.pdfviewer.PDFView.State.LOADED = r1
                com.github.barteksc.pdfviewer.PDFView$State r3 = new com.github.barteksc.pdfviewer.PDFView$State
                java.lang.String r5 = "SHOWN"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.barteksc.pdfviewer.PDFView.State.SHOWN = r3
                com.github.barteksc.pdfviewer.PDFView$State r5 = new com.github.barteksc.pdfviewer.PDFView$State
                java.lang.String r7 = "ERROR"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.barteksc.pdfviewer.PDFView.State.ERROR = r5
                r7 = 4
                com.github.barteksc.pdfviewer.PDFView$State[] r7 = new com.github.barteksc.pdfviewer.PDFView.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.github.barteksc.pdfviewer.PDFView.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.barteksc.pdfviewer.PDFView.State valueOf(java.lang.String r1) {
                java.lang.Class<com.github.barteksc.pdfviewer.PDFView$State> r0 = com.github.barteksc.pdfviewer.PDFView.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.barteksc.pdfviewer.PDFView$State r1 = (com.github.barteksc.pdfviewer.PDFView.State) r1
                return r1
        }

        public static com.github.barteksc.pdfviewer.PDFView.State[] values() {
                com.github.barteksc.pdfviewer.PDFView$State[] r0 = com.github.barteksc.pdfviewer.PDFView.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.barteksc.pdfviewer.PDFView$State[] r0 = (com.github.barteksc.pdfviewer.PDFView.State[]) r0
                return r0
        }
    }

    static {
            return
    }

    public PDFView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.minZoom = r5
            r0 = 1071644672(0x3fe00000, float:1.75)
            r3.midZoom = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r3.maxZoom = r0
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.NONE
            r3.scrollDir = r0
            r0 = 0
            r3.currentXOffset = r0
            r3.currentYOffset = r0
            r3.zoom = r5
            r5 = 1
            r3.recycled = r5
            com.github.barteksc.pdfviewer.PDFView$State r0 = com.github.barteksc.pdfviewer.PDFView.State.DEFAULT
            r3.state = r0
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = new com.github.barteksc.pdfviewer.listener.Callbacks
            r0.<init>()
            r3.callbacks = r0
            com.github.barteksc.pdfviewer.util.FitPolicy r0 = com.github.barteksc.pdfviewer.util.FitPolicy.WIDTH
            r3.pageFitPolicy = r0
            r0 = 0
            r3.fitEachPage = r0
            r3.defaultPage = r0
            r3.swipeVertical = r5
            r3.enableSwipe = r5
            r3.doubletapEnabled = r5
            r3.nightMode = r0
            r3.pageSnap = r5
            r3.isScrollHandleInit = r0
            r3.bestQuality = r0
            r3.annotationRendering = r0
            r3.renderDuringScale = r0
            r3.enableAntialiasing = r5
            android.graphics.PaintFlagsDrawFilter r1 = new android.graphics.PaintFlagsDrawFilter
            r2 = 3
            r1.<init>(r0, r2)
            r3.antialiasFilter = r1
            r3.spacingPx = r0
            r3.autoSpacing = r0
            r3.pageFling = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            r5.<init>(r1)
            r3.onDrawPagesNums = r5
            r3.hasSize = r0
            android.os.HandlerThread r5 = new android.os.HandlerThread
            java.lang.String r1 = "PDF renderer"
            r5.<init>(r1)
            r3.renderingHandlerThread = r5
            boolean r5 = r3.isInEditMode()
            if (r5 == 0) goto L6e
            return
        L6e:
            com.github.barteksc.pdfviewer.CacheManager r5 = new com.github.barteksc.pdfviewer.CacheManager
            r5.<init>()
            r3.cacheManager = r5
            com.github.barteksc.pdfviewer.AnimationManager r5 = new com.github.barteksc.pdfviewer.AnimationManager
            r5.<init>(r3)
            r3.animationManager = r5
            com.github.barteksc.pdfviewer.DragPinchManager r1 = new com.github.barteksc.pdfviewer.DragPinchManager
            r1.<init>(r3, r5)
            r3.dragPinchManager = r1
            com.github.barteksc.pdfviewer.PagesLoader r5 = new com.github.barteksc.pdfviewer.PagesLoader
            r5.<init>(r3)
            r3.pagesLoader = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r3.paint = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r3.debugPaint = r5
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r1)
            com.shockwave.pdfium.PdfiumCore r5 = new com.shockwave.pdfium.PdfiumCore
            r5.<init>(r4)
            r3.pdfiumCore = r5
            r3.setWillNotDraw(r0)
            return
    }

    static /* synthetic */ com.github.barteksc.pdfviewer.DragPinchManager access$100(com.github.barteksc.pdfviewer.PDFView r0) {
            com.github.barteksc.pdfviewer.DragPinchManager r0 = r0.dragPinchManager
            return r0
    }

    static /* synthetic */ void access$1000(com.github.barteksc.pdfviewer.PDFView r0, boolean r1) {
            r0.setFitEachPage(r1)
            return
    }

    static /* synthetic */ void access$1100(com.github.barteksc.pdfviewer.PDFView r0, com.github.barteksc.pdfviewer.source.DocumentSource r1, java.lang.String r2, int[] r3) {
            r0.load(r1, r2, r3)
            return
    }

    static /* synthetic */ void access$1200(com.github.barteksc.pdfviewer.PDFView r0, com.github.barteksc.pdfviewer.source.DocumentSource r1, java.lang.String r2) {
            r0.load(r1, r2)
            return
    }

    static /* synthetic */ boolean access$200(com.github.barteksc.pdfviewer.PDFView r0) {
            boolean r0 = r0.hasSize
            return r0
    }

    static /* synthetic */ com.github.barteksc.pdfviewer.PDFView.Configurator access$302(com.github.barteksc.pdfviewer.PDFView r0, com.github.barteksc.pdfviewer.PDFView.Configurator r1) {
            r0.waitingDocumentConfigurator = r1
            return r1
    }

    static /* synthetic */ void access$400(com.github.barteksc.pdfviewer.PDFView r0, int r1) {
            r0.setDefaultPage(r1)
            return
    }

    static /* synthetic */ void access$500(com.github.barteksc.pdfviewer.PDFView r0, boolean r1) {
            r0.setSwipeVertical(r1)
            return
    }

    static /* synthetic */ void access$600(com.github.barteksc.pdfviewer.PDFView r0, com.github.barteksc.pdfviewer.scroll.ScrollHandle r1) {
            r0.setScrollHandle(r1)
            return
    }

    static /* synthetic */ void access$700(com.github.barteksc.pdfviewer.PDFView r0, int r1) {
            r0.setSpacing(r1)
            return
    }

    static /* synthetic */ void access$800(com.github.barteksc.pdfviewer.PDFView r0, boolean r1) {
            r0.setAutoSpacing(r1)
            return
    }

    static /* synthetic */ void access$900(com.github.barteksc.pdfviewer.PDFView r0, com.github.barteksc.pdfviewer.util.FitPolicy r1) {
            r0.setPageFitPolicy(r1)
            return
    }

    private void drawPart(android.graphics.Canvas r12, com.github.barteksc.pdfviewer.model.PagePart r13) {
            r11 = this;
            android.graphics.RectF r0 = r13.getPageRelativeBounds()
            android.graphics.Bitmap r1 = r13.getRenderedBitmap()
            boolean r2 = r1.isRecycled()
            if (r2 == 0) goto Lf
            return
        Lf:
            com.github.barteksc.pdfviewer.PdfFile r2 = r11.pdfFile
            int r3 = r13.getPage()
            com.shockwave.pdfium.util.SizeF r2 = r2.getPageSize(r3)
            boolean r3 = r11.swipeVertical
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L3c
            com.github.barteksc.pdfviewer.PdfFile r3 = r11.pdfFile
            int r5 = r13.getPage()
            float r6 = r11.zoom
            float r3 = r3.getPageOffset(r5, r6)
            com.github.barteksc.pdfviewer.PdfFile r5 = r11.pdfFile
            float r5 = r5.getMaxPageWidth()
            float r6 = r2.b()
            float r5 = r5 - r6
            float r5 = r11.toCurrentScale(r5)
            float r5 = r5 / r4
            goto L58
        L3c:
            com.github.barteksc.pdfviewer.PdfFile r3 = r11.pdfFile
            int r5 = r13.getPage()
            float r6 = r11.zoom
            float r5 = r3.getPageOffset(r5, r6)
            com.github.barteksc.pdfviewer.PdfFile r3 = r11.pdfFile
            float r3 = r3.getMaxPageHeight()
            float r6 = r2.a()
            float r3 = r3 - r6
            float r3 = r11.toCurrentScale(r3)
            float r3 = r3 / r4
        L58:
            r12.translate(r5, r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            r8 = 0
            r4.<init>(r8, r8, r6, r7)
            float r6 = r0.left
            float r7 = r2.b()
            float r6 = r6 * r7
            float r6 = r11.toCurrentScale(r6)
            float r7 = r0.top
            float r8 = r2.a()
            float r7 = r7 * r8
            float r7 = r11.toCurrentScale(r7)
            float r8 = r0.width()
            float r9 = r2.b()
            float r8 = r8 * r9
            float r8 = r11.toCurrentScale(r8)
            float r0 = r0.height()
            float r2 = r2.a()
            float r0 = r0 * r2
            float r0 = r11.toCurrentScale(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            int r9 = (int) r6
            float r9 = (float) r9
            int r10 = (int) r7
            float r10 = (float) r10
            float r6 = r6 + r8
            int r6 = (int) r6
            float r6 = (float) r6
            float r7 = r7 + r0
            int r0 = (int) r7
            float r0 = (float) r0
            r2.<init>(r9, r10, r6, r0)
            float r0 = r11.currentXOffset
            float r0 = r0 + r5
            float r6 = r11.currentYOffset
            float r6 = r6 + r3
            float r7 = r2.left
            float r7 = r7 + r0
            int r8 = r11.getWidth()
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L101
            float r7 = r2.right
            float r0 = r0 + r7
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L101
            float r0 = r2.top
            float r0 = r0 + r6
            int r8 = r11.getHeight()
            float r8 = (float) r8
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L101
            float r0 = r2.bottom
            float r6 = r6 + r0
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 > 0) goto Lda
            goto L101
        Lda:
            android.graphics.Paint r0 = r11.paint
            r12.drawBitmap(r1, r4, r2, r0)
            boolean r0 = com.github.barteksc.pdfviewer.util.Constants.DEBUG_MODE
            if (r0 == 0) goto Lfb
            android.graphics.Paint r0 = r11.debugPaint
            int r13 = r13.getPage()
            int r13 = r13 % 2
            if (r13 != 0) goto Lf0
            r13 = -65536(0xffffffffffff0000, float:NaN)
            goto Lf3
        Lf0:
            r13 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
        Lf3:
            r0.setColor(r13)
            android.graphics.Paint r13 = r11.debugPaint
            r12.drawRect(r2, r13)
        Lfb:
            float r13 = -r5
            float r0 = -r3
            r12.translate(r13, r0)
            return
        L101:
            float r13 = -r5
            float r0 = -r3
            r12.translate(r13, r0)
            return
    }

    private void drawWithListener(android.graphics.Canvas r5, int r6, com.github.barteksc.pdfviewer.listener.OnDrawListener r7) {
            r4 = this;
            if (r7 == 0) goto L3b
            boolean r0 = r4.swipeVertical
            r1 = 0
            if (r0 == 0) goto L10
            com.github.barteksc.pdfviewer.PdfFile r0 = r4.pdfFile
            float r2 = r4.zoom
            float r0 = r0.getPageOffset(r6, r2)
            goto L1a
        L10:
            com.github.barteksc.pdfviewer.PdfFile r0 = r4.pdfFile
            float r2 = r4.zoom
            float r0 = r0.getPageOffset(r6, r2)
            r1 = r0
            r0 = 0
        L1a:
            r5.translate(r1, r0)
            com.github.barteksc.pdfviewer.PdfFile r2 = r4.pdfFile
            com.shockwave.pdfium.util.SizeF r2 = r2.getPageSize(r6)
            float r3 = r2.b()
            float r3 = r4.toCurrentScale(r3)
            float r2 = r2.a()
            float r2 = r4.toCurrentScale(r2)
            r7.onLayerDrawn(r5, r3, r2, r6)
            float r6 = -r1
            float r7 = -r0
            r5.translate(r6, r7)
        L3b:
            return
    }

    private void load(com.github.barteksc.pdfviewer.source.DocumentSource r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.load(r2, r3, r0)
            return
    }

    private void load(com.github.barteksc.pdfviewer.source.DocumentSource r8, java.lang.String r9, int[] r10) {
            r7 = this;
            boolean r0 = r7.recycled
            if (r0 == 0) goto L1c
            r0 = 0
            r7.recycled = r0
            com.github.barteksc.pdfviewer.DecodingAsyncTask r1 = new com.github.barteksc.pdfviewer.DecodingAsyncTask
            com.shockwave.pdfium.PdfiumCore r6 = r7.pdfiumCore
            r5 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r5.decodingAsyncTask = r1
            java.util.concurrent.Executor r8 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.lang.Void[] r9 = new java.lang.Void[r0]
            r1.executeOnExecutor(r8, r9)
            return
        L1c:
            r5 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Don't call load on a PDF View without recycling it first."
            r8.<init>(r9)
            throw r8
    }

    private void setAutoSpacing(boolean r1) {
            r0 = this;
            r0.autoSpacing = r1
            return
    }

    private void setDefaultPage(int r1) {
            r0 = this;
            r0.defaultPage = r1
            return
    }

    private void setFitEachPage(boolean r1) {
            r0 = this;
            r0.fitEachPage = r1
            return
    }

    private void setPageFitPolicy(com.github.barteksc.pdfviewer.util.FitPolicy r1) {
            r0 = this;
            r0.pageFitPolicy = r1
            return
    }

    private void setScrollHandle(com.github.barteksc.pdfviewer.scroll.ScrollHandle r1) {
            r0 = this;
            r0.scrollHandle = r1
            return
    }

    private void setSpacing(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = com.github.barteksc.pdfviewer.util.Util.getDP(r0, r2)
            r1.spacingPx = r2
            return
    }

    private void setSwipeVertical(boolean r1) {
            r0 = this;
            r0.swipeVertical = r1
            return
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r5) {
            r4 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r4.pdfFile
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r4.swipeVertical
            r3 = 0
            if (r2 == 0) goto L2b
            if (r5 >= 0) goto L14
            float r2 = r4.currentXOffset
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L14
            return r1
        L14:
            if (r5 <= 0) goto L49
            float r5 = r4.currentXOffset
            float r0 = r0.getMaxPageWidth()
            float r0 = r4.toCurrentScale(r0)
            float r5 = r5 + r0
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L49
            return r1
        L2b:
            if (r5 >= 0) goto L34
            float r2 = r4.currentXOffset
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L34
            return r1
        L34:
            if (r5 <= 0) goto L49
            float r5 = r4.currentXOffset
            float r2 = r4.zoom
            float r0 = r0.getDocLen(r2)
            float r5 = r5 + r0
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L49
            return r1
        L49:
            r5 = 0
            return r5
    }

    @Override // android.view.View
    public boolean canScrollVertically(int r5) {
            r4 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r4.pdfFile
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r4.swipeVertical
            r3 = 0
            if (r2 == 0) goto L29
            if (r5 >= 0) goto L14
            float r2 = r4.currentYOffset
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L14
            return r1
        L14:
            if (r5 <= 0) goto L49
            float r5 = r4.currentYOffset
            float r2 = r4.zoom
            float r0 = r0.getDocLen(r2)
            float r5 = r5 + r0
            int r0 = r4.getHeight()
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L49
            return r1
        L29:
            if (r5 >= 0) goto L32
            float r2 = r4.currentYOffset
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L32
            return r1
        L32:
            if (r5 <= 0) goto L49
            float r5 = r4.currentYOffset
            float r0 = r0.getMaxPageHeight()
            float r0 = r4.toCurrentScale(r0)
            float r5 = r5 + r0
            int r0 = r4.getHeight()
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L49
            return r1
        L49:
            r5 = 0
            return r5
    }

    @Override // android.view.View
    public void computeScroll() {
            r1 = this;
            super.computeScroll()
            boolean r0 = r1.isInEditMode()
            if (r0 == 0) goto La
            return
        La:
            com.github.barteksc.pdfviewer.AnimationManager r0 = r1.animationManager
            r0.computeFling()
            return
    }

    public boolean doRenderDuringScale() {
            r1 = this;
            boolean r0 = r1.renderDuringScale
            return r0
    }

    public boolean documentFitsView() {
            r4 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r4.pdfFile
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0.getDocLen(r1)
            boolean r1 = r4.swipeVertical
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            int r1 = r4.getHeight()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            return r3
        L18:
            return r2
        L19:
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L23
            return r3
        L23:
            return r2
    }

    public void enableAnnotationRendering(boolean r1) {
            r0 = this;
            r0.annotationRendering = r1
            return
    }

    public void enableAntialiasing(boolean r1) {
            r0 = this;
            r0.enableAntialiasing = r1
            return
    }

    void enableDoubletap(boolean r1) {
            r0 = this;
            r0.doubletapEnabled = r1
            return
    }

    public void enableRenderDuringScale(boolean r1) {
            r0 = this;
            r0.renderDuringScale = r1
            return
    }

    int findFocusPage(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.swipeVertical
            if (r0 == 0) goto L5
            r3 = r4
        L5:
            if (r0 == 0) goto Ld
            int r4 = r2.getHeight()
        Lb:
            float r4 = (float) r4
            goto L12
        Ld:
            int r4 = r2.getWidth()
            goto Lb
        L12:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1a
            r3 = 0
            return r3
        L1a:
            com.github.barteksc.pdfviewer.PdfFile r0 = r2.pdfFile
            float r1 = r2.zoom
            float r0 = r0.getDocLen(r1)
            float r0 = -r0
            float r0 = r0 + r4
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L34
            com.github.barteksc.pdfviewer.PdfFile r3 = r2.pdfFile
            int r3 = r3.getPagesCount()
            int r3 = r3 + (-1)
            return r3
        L34:
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r3 = r3 - r4
            com.github.barteksc.pdfviewer.PdfFile r4 = r2.pdfFile
            float r3 = -r3
            float r0 = r2.zoom
            int r3 = r4.getPageAtOffset(r3, r0)
            return r3
    }

    com.github.barteksc.pdfviewer.util.SnapEdge findSnapEdge(int r6) {
            r5 = this;
            boolean r0 = r5.pageSnap
            if (r0 == 0) goto L49
            if (r6 >= 0) goto L7
            goto L49
        L7:
            boolean r0 = r5.swipeVertical
            if (r0 == 0) goto Le
            float r0 = r5.currentYOffset
            goto L10
        Le:
            float r0 = r5.currentXOffset
        L10:
            com.github.barteksc.pdfviewer.PdfFile r1 = r5.pdfFile
            float r2 = r5.zoom
            float r1 = r1.getPageOffset(r6, r2)
            float r1 = -r1
            boolean r2 = r5.swipeVertical
            if (r2 == 0) goto L22
            int r2 = r5.getHeight()
            goto L26
        L22:
            int r2 = r5.getWidth()
        L26:
            com.github.barteksc.pdfviewer.PdfFile r3 = r5.pdfFile
            float r4 = r5.zoom
            float r6 = r3.getPageLength(r6, r4)
            float r2 = (float) r2
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 < 0) goto L36
            com.github.barteksc.pdfviewer.util.SnapEdge r6 = com.github.barteksc.pdfviewer.util.SnapEdge.CENTER
            return r6
        L36:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 < 0) goto L3d
            com.github.barteksc.pdfviewer.util.SnapEdge r6 = com.github.barteksc.pdfviewer.util.SnapEdge.START
            return r6
        L3d:
            float r1 = r1 - r6
            float r0 = r0 - r2
            int r6 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r6 <= 0) goto L46
            com.github.barteksc.pdfviewer.util.SnapEdge r6 = com.github.barteksc.pdfviewer.util.SnapEdge.END
            return r6
        L46:
            com.github.barteksc.pdfviewer.util.SnapEdge r6 = com.github.barteksc.pdfviewer.util.SnapEdge.NONE
            return r6
        L49:
            com.github.barteksc.pdfviewer.util.SnapEdge r6 = com.github.barteksc.pdfviewer.util.SnapEdge.NONE
            return r6
    }

    public void fitToWidth(int r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$State r0 = r2.state
            com.github.barteksc.pdfviewer.PDFView$State r1 = com.github.barteksc.pdfviewer.PDFView.State.SHOWN
            if (r0 == r1) goto L7
            return
        L7:
            int r0 = r2.getWidth()
            float r0 = (float) r0
            com.github.barteksc.pdfviewer.PdfFile r1 = r2.pdfFile
            com.shockwave.pdfium.util.SizeF r1 = r1.getPageSize(r3)
            float r1 = r1.b()
            float r0 = r0 / r1
            r2.zoomTo(r0)
            r2.jumpTo(r3)
            return
    }

    public com.github.barteksc.pdfviewer.PDFView.Configurator fromAsset(java.lang.String r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = new com.github.barteksc.pdfviewer.PDFView$Configurator
            com.github.barteksc.pdfviewer.source.AssetSource r1 = new com.github.barteksc.pdfviewer.source.AssetSource
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    public com.github.barteksc.pdfviewer.PDFView.Configurator fromBytes(byte[] r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = new com.github.barteksc.pdfviewer.PDFView$Configurator
            com.github.barteksc.pdfviewer.source.ByteArraySource r1 = new com.github.barteksc.pdfviewer.source.ByteArraySource
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    public com.github.barteksc.pdfviewer.PDFView.Configurator fromFile(java.io.File r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = new com.github.barteksc.pdfviewer.PDFView$Configurator
            com.github.barteksc.pdfviewer.source.FileSource r1 = new com.github.barteksc.pdfviewer.source.FileSource
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    public com.github.barteksc.pdfviewer.PDFView.Configurator fromSource(com.github.barteksc.pdfviewer.source.DocumentSource r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = new com.github.barteksc.pdfviewer.PDFView$Configurator
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public com.github.barteksc.pdfviewer.PDFView.Configurator fromStream(java.io.InputStream r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = new com.github.barteksc.pdfviewer.PDFView$Configurator
            com.github.barteksc.pdfviewer.source.InputStreamSource r1 = new com.github.barteksc.pdfviewer.source.InputStreamSource
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    public com.github.barteksc.pdfviewer.PDFView.Configurator fromUri(android.net.Uri r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = new com.github.barteksc.pdfviewer.PDFView$Configurator
            com.github.barteksc.pdfviewer.source.UriSource r1 = new com.github.barteksc.pdfviewer.source.UriSource
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    public int getCurrentPage() {
            r1 = this;
            int r0 = r1.currentPage
            return r0
    }

    public float getCurrentXOffset() {
            r1 = this;
            float r0 = r1.currentXOffset
            return r0
    }

    public float getCurrentYOffset() {
            r1 = this;
            float r0 = r1.currentYOffset
            return r0
    }

    public com.shockwave.pdfium.PdfDocument.Meta getDocumentMeta() {
            r1 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r1.pdfFile
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.shockwave.pdfium.PdfDocument$Meta r0 = r0.getMetaData()
            return r0
    }

    public java.util.List<com.shockwave.pdfium.PdfDocument.Link> getLinks(int r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r1.pdfFile
            if (r0 != 0) goto L7
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        L7:
            java.util.List r2 = r0.getPageLinks(r2)
            return r2
    }

    public float getMaxZoom() {
            r1 = this;
            float r0 = r1.maxZoom
            return r0
    }

    public float getMidZoom() {
            r1 = this;
            float r0 = r1.midZoom
            return r0
    }

    public float getMinZoom() {
            r1 = this;
            float r0 = r1.minZoom
            return r0
    }

    public int getPageAtPositionOffset(float r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r2.pdfFile
            float r1 = r2.zoom
            float r1 = r0.getDocLen(r1)
            float r1 = r1 * r3
            float r3 = r2.zoom
            int r3 = r0.getPageAtOffset(r1, r3)
            return r3
    }

    public int getPageCount() {
            r1 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r1.pdfFile
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getPagesCount()
            return r0
    }

    public com.github.barteksc.pdfviewer.util.FitPolicy getPageFitPolicy() {
            r1 = this;
            com.github.barteksc.pdfviewer.util.FitPolicy r0 = r1.pageFitPolicy
            return r0
    }

    public com.shockwave.pdfium.util.SizeF getPageSize(int r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r1.pdfFile
            if (r0 != 0) goto Lb
            com.shockwave.pdfium.util.SizeF r2 = new com.shockwave.pdfium.util.SizeF
            r0 = 0
            r2.<init>(r0, r0)
            return r2
        Lb:
            com.shockwave.pdfium.util.SizeF r2 = r0.getPageSize(r2)
            return r2
    }

    public float getPositionOffset() {
            r3 = this;
            boolean r0 = r3.swipeVertical
            if (r0 == 0) goto L17
            float r0 = r3.currentYOffset
            float r0 = -r0
            com.github.barteksc.pdfviewer.PdfFile r1 = r3.pdfFile
            float r2 = r3.zoom
            float r1 = r1.getDocLen(r2)
            int r2 = r3.getHeight()
        L13:
            float r2 = (float) r2
            float r1 = r1 - r2
            float r0 = r0 / r1
            goto L27
        L17:
            float r0 = r3.currentXOffset
            float r0 = -r0
            com.github.barteksc.pdfviewer.PdfFile r1 = r3.pdfFile
            float r2 = r3.zoom
            float r1 = r1.getDocLen(r2)
            int r2 = r3.getWidth()
            goto L13
        L27:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.github.barteksc.pdfviewer.util.MathUtils.limit(r0, r1, r2)
            return r0
    }

    com.github.barteksc.pdfviewer.scroll.ScrollHandle getScrollHandle() {
            r1 = this;
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r0 = r1.scrollHandle
            return r0
    }

    public int getSpacingPx() {
            r1 = this;
            int r0 = r1.spacingPx
            return r0
    }

    public java.util.List<com.shockwave.pdfium.PdfDocument.Bookmark> getTableOfContents() {
            r1 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r1.pdfFile
            if (r0 != 0) goto L7
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L7:
            java.util.List r0 = r0.getBookmarks()
            return r0
    }

    public float getZoom() {
            r1 = this;
            float r0 = r1.zoom
            return r0
    }

    public boolean isAnnotationRendering() {
            r1 = this;
            boolean r0 = r1.annotationRendering
            return r0
    }

    public boolean isAntialiasing() {
            r1 = this;
            boolean r0 = r1.enableAntialiasing
            return r0
    }

    public boolean isAutoSpacingEnabled() {
            r1 = this;
            boolean r0 = r1.autoSpacing
            return r0
    }

    public boolean isBestQuality() {
            r1 = this;
            boolean r0 = r1.bestQuality
            return r0
    }

    boolean isDoubletapEnabled() {
            r1 = this;
            boolean r0 = r1.doubletapEnabled
            return r0
    }

    public boolean isFitEachPage() {
            r1 = this;
            boolean r0 = r1.fitEachPage
            return r0
    }

    public boolean isPageFlingEnabled() {
            r1 = this;
            boolean r0 = r1.pageFling
            return r0
    }

    public boolean isPageSnap() {
            r1 = this;
            boolean r0 = r1.pageSnap
            return r0
    }

    public boolean isRecycled() {
            r1 = this;
            boolean r0 = r1.recycled
            return r0
    }

    public boolean isSwipeEnabled() {
            r1 = this;
            boolean r0 = r1.enableSwipe
            return r0
    }

    public boolean isSwipeVertical() {
            r1 = this;
            boolean r0 = r1.swipeVertical
            return r0
    }

    public boolean isZooming() {
            r2 = this;
            float r0 = r2.zoom
            float r1 = r2.minZoom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void jumpTo(int r2) {
            r1 = this;
            r0 = 0
            r1.jumpTo(r2, r0)
            return
    }

    public void jumpTo(int r3, boolean r4) {
            r2 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r2.pdfFile
            if (r0 != 0) goto L5
            return
        L5:
            int r3 = r0.determineValidPageNumberFrom(r3)
            if (r3 != 0) goto Ld
            r0 = 0
            goto L16
        Ld:
            com.github.barteksc.pdfviewer.PdfFile r0 = r2.pdfFile
            float r1 = r2.zoom
            float r0 = r0.getPageOffset(r3, r1)
            float r0 = -r0
        L16:
            boolean r1 = r2.swipeVertical
            if (r1 == 0) goto L2a
            if (r4 == 0) goto L24
            com.github.barteksc.pdfviewer.AnimationManager r4 = r2.animationManager
            float r1 = r2.currentYOffset
            r4.startYAnimation(r1, r0)
            goto L39
        L24:
            float r4 = r2.currentXOffset
            r2.moveTo(r4, r0)
            goto L39
        L2a:
            if (r4 == 0) goto L34
            com.github.barteksc.pdfviewer.AnimationManager r4 = r2.animationManager
            float r1 = r2.currentXOffset
            r4.startXAnimation(r1, r0)
            goto L39
        L34:
            float r4 = r2.currentYOffset
            r2.moveTo(r0, r4)
        L39:
            r2.showPage(r3)
            return
    }

    void loadComplete(com.github.barteksc.pdfviewer.PdfFile r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$State r0 = com.github.barteksc.pdfviewer.PDFView.State.LOADED
            r2.state = r0
            r2.pdfFile = r3
            android.os.HandlerThread r0 = r2.renderingHandlerThread
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L13
            android.os.HandlerThread r0 = r2.renderingHandlerThread
            r0.start()
        L13:
            com.github.barteksc.pdfviewer.RenderingHandler r0 = new com.github.barteksc.pdfviewer.RenderingHandler
            android.os.HandlerThread r1 = r2.renderingHandlerThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1, r2)
            r2.renderingHandler = r0
            r0.start()
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r0 = r2.scrollHandle
            if (r0 == 0) goto L2d
            r0.setupLayout(r2)
            r0 = 1
            r2.isScrollHandleInit = r0
        L2d:
            com.github.barteksc.pdfviewer.DragPinchManager r0 = r2.dragPinchManager
            r0.enable()
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = r2.callbacks
            int r3 = r3.getPagesCount()
            r0.callOnLoadComplete(r3)
            int r3 = r2.defaultPage
            r0 = 0
            r2.jumpTo(r3, r0)
            return
    }

    void loadError(java.lang.Throwable r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView$State r0 = com.github.barteksc.pdfviewer.PDFView.State.ERROR
            r1.state = r0
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = r1.callbacks
            com.github.barteksc.pdfviewer.listener.OnErrorListener r0 = r0.getOnError()
            r1.recycle()
            r1.invalidate()
            if (r0 == 0) goto L15
            r0.onError(r2)
        L15:
            return
    }

    void loadPageByOffset() {
            r3 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r3.pdfFile
            int r0 = r0.getPagesCount()
            if (r0 != 0) goto L9
            return
        L9:
            boolean r0 = r3.swipeVertical
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L18
            float r0 = r3.currentYOffset
            int r2 = r3.getHeight()
        L15:
            float r2 = (float) r2
            float r2 = r2 / r1
            goto L1f
        L18:
            float r0 = r3.currentXOffset
            int r2 = r3.getWidth()
            goto L15
        L1f:
            com.github.barteksc.pdfviewer.PdfFile r1 = r3.pdfFile
            float r0 = r0 - r2
            float r0 = -r0
            float r2 = r3.zoom
            int r0 = r1.getPageAtOffset(r0, r2)
            if (r0 < 0) goto L3f
            com.github.barteksc.pdfviewer.PdfFile r1 = r3.pdfFile
            int r1 = r1.getPagesCount()
            int r1 = r1 + (-1)
            if (r0 > r1) goto L3f
            int r1 = r3.getCurrentPage()
            if (r0 == r1) goto L3f
            r3.showPage(r0)
            return
        L3f:
            r3.loadPages()
            return
    }

    public void loadPages() {
            r2 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r2.pdfFile
            if (r0 == 0) goto L1a
            com.github.barteksc.pdfviewer.RenderingHandler r0 = r2.renderingHandler
            if (r0 != 0) goto L9
            goto L1a
        L9:
            r1 = 1
            r0.removeMessages(r1)
            com.github.barteksc.pdfviewer.CacheManager r0 = r2.cacheManager
            r0.makeANewSet()
            com.github.barteksc.pdfviewer.PagesLoader r0 = r2.pagesLoader
            r0.loadPages()
            r2.redraw()
        L1a:
            return
    }

    public void moveRelativeTo(float r2, float r3) {
            r1 = this;
            float r0 = r1.currentXOffset
            float r0 = r0 + r2
            float r2 = r1.currentYOffset
            float r2 = r2 + r3
            r1.moveTo(r0, r2)
            return
    }

    public void moveTo(float r2, float r3) {
            r1 = this;
            r0 = 1
            r1.moveTo(r2, r3, r0)
            return
    }

    public void moveTo(float r6, float r7, boolean r8) {
            r5 = this;
            boolean r0 = r5.swipeVertical
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r0 == 0) goto L88
            com.github.barteksc.pdfviewer.PdfFile r0 = r5.pdfFile
            float r0 = r0.getMaxPageWidth()
            float r0 = r5.toCurrentScale(r0)
            int r3 = r5.getWidth()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L24
            int r6 = r5.getWidth()
            int r6 = r6 / 2
            float r6 = (float) r6
            float r0 = r0 / r1
        L22:
            float r6 = r6 - r0
            goto L3b
        L24:
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2a
            r6 = 0
            goto L3b
        L2a:
            float r3 = r6 + r0
            int r4 = r5.getWidth()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L3b
            int r6 = r5.getWidth()
            float r6 = (float) r6
            goto L22
        L3b:
            com.github.barteksc.pdfviewer.PdfFile r0 = r5.pdfFile
            float r3 = r5.zoom
            float r0 = r0.getDocLen(r3)
            int r3 = r5.getHeight()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L54
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float r7 = r7 - r0
            float r7 = r7 / r1
            goto L6c
        L54:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L5a
            r7 = 0
            goto L6c
        L5a:
            float r1 = r7 + r0
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L6c
            float r7 = -r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r7 = r7 + r0
        L6c:
            float r0 = r5.currentYOffset
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto L78
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.END
            r5.scrollDir = r0
            goto L105
        L78:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L82
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.START
            r5.scrollDir = r0
            goto L105
        L82:
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.NONE
            r5.scrollDir = r0
            goto L105
        L88:
            com.github.barteksc.pdfviewer.PdfFile r0 = r5.pdfFile
            float r0 = r0.getMaxPageHeight()
            float r0 = r5.toCurrentScale(r0)
            int r3 = r5.getHeight()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto La5
            int r7 = r5.getHeight()
            int r7 = r7 / 2
            float r7 = (float) r7
            float r0 = r0 / r1
        La3:
            float r7 = r7 - r0
            goto Lbc
        La5:
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 <= 0) goto Lab
            r7 = 0
            goto Lbc
        Lab:
            float r3 = r7 + r0
            int r4 = r5.getHeight()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto Lbc
            int r7 = r5.getHeight()
            float r7 = (float) r7
            goto La3
        Lbc:
            com.github.barteksc.pdfviewer.PdfFile r0 = r5.pdfFile
            float r3 = r5.zoom
            float r0 = r0.getDocLen(r3)
            int r3 = r5.getWidth()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld5
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 / r1
            goto Led
        Ld5:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ldb
            r6 = 0
            goto Led
        Ldb:
            float r1 = r6 + r0
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto Led
            float r6 = -r0
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 + r0
        Led:
            float r0 = r5.currentXOffset
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lf8
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.END
            r5.scrollDir = r0
            goto L105
        Lf8:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L101
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.START
            r5.scrollDir = r0
            goto L105
        L101:
            com.github.barteksc.pdfviewer.PDFView$ScrollDir r0 = com.github.barteksc.pdfviewer.PDFView.ScrollDir.NONE
            r5.scrollDir = r0
        L105:
            r5.currentXOffset = r6
            r5.currentYOffset = r7
            float r6 = r5.getPositionOffset()
            if (r8 == 0) goto L11e
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r7 = r5.scrollHandle
            if (r7 == 0) goto L11e
            boolean r7 = r5.documentFitsView()
            if (r7 != 0) goto L11e
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r7 = r5.scrollHandle
            r7.setScroll(r6)
        L11e:
            com.github.barteksc.pdfviewer.listener.Callbacks r7 = r5.callbacks
            int r8 = r5.getCurrentPage()
            r7.callOnPageScroll(r8, r6)
            r5.redraw()
            return
    }

    public void onBitmapRendered(com.github.barteksc.pdfviewer.model.PagePart r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView$State r0 = r2.state
            com.github.barteksc.pdfviewer.PDFView$State r1 = com.github.barteksc.pdfviewer.PDFView.State.LOADED
            if (r0 != r1) goto L15
            com.github.barteksc.pdfviewer.PDFView$State r0 = com.github.barteksc.pdfviewer.PDFView.State.SHOWN
            r2.state = r0
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = r2.callbacks
            com.github.barteksc.pdfviewer.PdfFile r1 = r2.pdfFile
            int r1 = r1.getPagesCount()
            r0.callOnRender(r1)
        L15:
            boolean r0 = r3.isThumbnail()
            if (r0 == 0) goto L21
            com.github.barteksc.pdfviewer.CacheManager r0 = r2.cacheManager
            r0.cacheThumbnail(r3)
            goto L26
        L21:
            com.github.barteksc.pdfviewer.CacheManager r0 = r2.cacheManager
            r0.cachePart(r3)
        L26:
            r2.redraw()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r1.recycle()
            android.os.HandlerThread r0 = r1.renderingHandlerThread
            if (r0 == 0) goto Ld
            r0.quitSafely()
            r0 = 0
            r1.renderingHandlerThread = r0
        Ld:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            boolean r0 = r6.isInEditMode()
            if (r0 == 0) goto L7
            goto L30
        L7:
            boolean r0 = r6.enableAntialiasing
            if (r0 == 0) goto L10
            android.graphics.PaintFlagsDrawFilter r0 = r6.antialiasFilter
            r7.setDrawFilter(r0)
        L10:
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            if (r0 != 0) goto L22
            boolean r0 = r6.nightMode
            if (r0 == 0) goto L1d
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L1e
        L1d:
            r0 = -1
        L1e:
            r7.drawColor(r0)
            goto L25
        L22:
            r0.draw(r7)
        L25:
            boolean r0 = r6.recycled
            if (r0 == 0) goto L2a
            goto L30
        L2a:
            com.github.barteksc.pdfviewer.PDFView$State r0 = r6.state
            com.github.barteksc.pdfviewer.PDFView$State r1 = com.github.barteksc.pdfviewer.PDFView.State.SHOWN
            if (r0 == r1) goto L31
        L30:
            return
        L31:
            float r0 = r6.currentXOffset
            float r1 = r6.currentYOffset
            r7.translate(r0, r1)
            com.github.barteksc.pdfviewer.CacheManager r2 = r6.cacheManager
            java.util.List r2 = r2.getThumbnails()
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()
            com.github.barteksc.pdfviewer.model.PagePart r3 = (com.github.barteksc.pdfviewer.model.PagePart) r3
            r6.drawPart(r7, r3)
            goto L42
        L52:
            com.github.barteksc.pdfviewer.CacheManager r2 = r6.cacheManager
            java.util.List r2 = r2.getPageParts()
            java.util.Iterator r2 = r2.iterator()
        L5c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()
            com.github.barteksc.pdfviewer.model.PagePart r3 = (com.github.barteksc.pdfviewer.model.PagePart) r3
            r6.drawPart(r7, r3)
            com.github.barteksc.pdfviewer.listener.Callbacks r4 = r6.callbacks
            com.github.barteksc.pdfviewer.listener.OnDrawListener r4 = r4.getOnDrawAll()
            if (r4 == 0) goto L5c
            java.util.List<java.lang.Integer> r4 = r6.onDrawPagesNums
            int r5 = r3.getPage()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L5c
            java.util.List<java.lang.Integer> r4 = r6.onDrawPagesNums
            int r3 = r3.getPage()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L5c
        L91:
            java.util.List<java.lang.Integer> r2 = r6.onDrawPagesNums
            java.util.Iterator r2 = r2.iterator()
        L97:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.github.barteksc.pdfviewer.listener.Callbacks r4 = r6.callbacks
            com.github.barteksc.pdfviewer.listener.OnDrawListener r4 = r4.getOnDrawAll()
            r6.drawWithListener(r7, r3, r4)
            goto L97
        Lb1:
            java.util.List<java.lang.Integer> r2 = r6.onDrawPagesNums
            r2.clear()
            int r2 = r6.currentPage
            com.github.barteksc.pdfviewer.listener.Callbacks r3 = r6.callbacks
            com.github.barteksc.pdfviewer.listener.OnDrawListener r3 = r3.getOnDraw()
            r6.drawWithListener(r7, r2, r3)
            float r0 = -r0
            float r1 = -r1
            r7.translate(r0, r1)
            return
    }

    void onPageError(com.github.barteksc.pdfviewer.exception.PageRenderingException r4) {
            r3 = this;
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = r3.callbacks
            int r1 = r4.getPage()
            java.lang.Throwable r2 = r4.getCause()
            boolean r0 = r0.callOnPageError(r1, r2)
            if (r0 != 0) goto L16
            r4.getPage()
            r4.getCause()
        L16:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = 1
            r3.hasSize = r0
            com.github.barteksc.pdfviewer.PDFView$Configurator r0 = r3.waitingDocumentConfigurator
            if (r0 == 0) goto La
            r0.load()
        La:
            boolean r0 = r3.isInEditMode()
            if (r0 != 0) goto Lab
            com.github.barteksc.pdfviewer.PDFView$State r0 = r3.state
            com.github.barteksc.pdfviewer.PDFView$State r1 = com.github.barteksc.pdfviewer.PDFView.State.SHOWN
            if (r0 == r1) goto L18
            goto Lab
        L18:
            float r0 = r3.currentXOffset
            float r0 = -r0
            float r6 = (float) r6
            r1 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r1
            float r0 = r0 + r6
            float r6 = r3.currentYOffset
            float r6 = -r6
            float r7 = (float) r7
            float r7 = r7 * r1
            float r6 = r6 + r7
            boolean r7 = r3.swipeVertical
            if (r7 == 0) goto L3d
            com.github.barteksc.pdfviewer.PdfFile r7 = r3.pdfFile
            float r7 = r7.getMaxPageWidth()
            float r0 = r0 / r7
            com.github.barteksc.pdfviewer.PdfFile r7 = r3.pdfFile
            float r2 = r3.zoom
            float r7 = r7.getDocLen(r2)
        L3b:
            float r6 = r6 / r7
            goto L4d
        L3d:
            com.github.barteksc.pdfviewer.PdfFile r7 = r3.pdfFile
            float r2 = r3.zoom
            float r7 = r7.getDocLen(r2)
            float r0 = r0 / r7
            com.github.barteksc.pdfviewer.PdfFile r7 = r3.pdfFile
            float r7 = r7.getMaxPageHeight()
            goto L3b
        L4d:
            com.github.barteksc.pdfviewer.AnimationManager r7 = r3.animationManager
            r7.stopAll()
            com.github.barteksc.pdfviewer.PdfFile r7 = r3.pdfFile
            com.shockwave.pdfium.util.Size r2 = new com.shockwave.pdfium.util.Size
            r2.<init>(r4, r5)
            r7.recalculatePageSizes(r2)
            boolean r7 = r3.swipeVertical
            if (r7 == 0) goto L81
            float r7 = -r0
            com.github.barteksc.pdfviewer.PdfFile r0 = r3.pdfFile
            float r0 = r0.getMaxPageWidth()
            float r7 = r7 * r0
            float r4 = (float) r4
            float r4 = r4 * r1
            float r7 = r7 + r4
            r3.currentXOffset = r7
            float r4 = -r6
            com.github.barteksc.pdfviewer.PdfFile r6 = r3.pdfFile
            float r7 = r3.zoom
            float r6 = r6.getDocLen(r7)
            float r4 = r4 * r6
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r3.currentYOffset = r4
            goto La1
        L81:
            float r7 = -r0
            com.github.barteksc.pdfviewer.PdfFile r0 = r3.pdfFile
            float r2 = r3.zoom
            float r0 = r0.getDocLen(r2)
            float r7 = r7 * r0
            float r4 = (float) r4
            float r4 = r4 * r1
            float r7 = r7 + r4
            r3.currentXOffset = r7
            float r4 = -r6
            com.github.barteksc.pdfviewer.PdfFile r6 = r3.pdfFile
            float r6 = r6.getMaxPageHeight()
            float r4 = r4 * r6
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r3.currentYOffset = r4
        La1:
            float r4 = r3.currentXOffset
            float r5 = r3.currentYOffset
            r3.moveTo(r4, r5)
            r3.loadPageByOffset()
        Lab:
            return
    }

    public boolean pageFillsScreen() {
            r5 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r5.pdfFile
            int r1 = r5.currentPage
            float r2 = r5.zoom
            float r0 = r0.getPageOffset(r1, r2)
            float r0 = -r0
            com.github.barteksc.pdfviewer.PdfFile r1 = r5.pdfFile
            int r2 = r5.currentPage
            float r3 = r5.zoom
            float r1 = r1.getPageLength(r2, r3)
            float r1 = r0 - r1
            boolean r2 = r5.isSwipeVertical()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            float r2 = r5.currentYOffset
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L30
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L30
            return r4
        L30:
            return r3
        L31:
            float r2 = r5.currentXOffset
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L42
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L42
            return r4
        L42:
            return r3
    }

    public void performPageSnap() {
            r3 = this;
            boolean r0 = r3.pageSnap
            if (r0 == 0) goto L39
            com.github.barteksc.pdfviewer.PdfFile r0 = r3.pdfFile
            if (r0 == 0) goto L39
            int r0 = r0.getPagesCount()
            if (r0 != 0) goto Lf
            goto L39
        Lf:
            float r0 = r3.currentXOffset
            float r1 = r3.currentYOffset
            int r0 = r3.findFocusPage(r0, r1)
            com.github.barteksc.pdfviewer.util.SnapEdge r1 = r3.findSnapEdge(r0)
            com.github.barteksc.pdfviewer.util.SnapEdge r2 = com.github.barteksc.pdfviewer.util.SnapEdge.NONE
            if (r1 != r2) goto L20
            goto L39
        L20:
            float r0 = r3.snapOffsetForPage(r0, r1)
            boolean r1 = r3.swipeVertical
            if (r1 == 0) goto L31
            com.github.barteksc.pdfviewer.AnimationManager r1 = r3.animationManager
            float r2 = r3.currentYOffset
            float r0 = -r0
            r1.startYAnimation(r2, r0)
            return
        L31:
            com.github.barteksc.pdfviewer.AnimationManager r1 = r3.animationManager
            float r2 = r3.currentXOffset
            float r0 = -r0
            r1.startXAnimation(r2, r0)
        L39:
            return
    }

    public void recycle() {
            r4 = this;
            r0 = 0
            r4.waitingDocumentConfigurator = r0
            com.github.barteksc.pdfviewer.AnimationManager r1 = r4.animationManager
            r1.stopAll()
            com.github.barteksc.pdfviewer.DragPinchManager r1 = r4.dragPinchManager
            r1.disable()
            com.github.barteksc.pdfviewer.RenderingHandler r1 = r4.renderingHandler
            r2 = 1
            if (r1 == 0) goto L1a
            r1.stop()
            com.github.barteksc.pdfviewer.RenderingHandler r1 = r4.renderingHandler
            r1.removeMessages(r2)
        L1a:
            com.github.barteksc.pdfviewer.DecodingAsyncTask r1 = r4.decodingAsyncTask
            if (r1 == 0) goto L21
            r1.cancel(r2)
        L21:
            com.github.barteksc.pdfviewer.CacheManager r1 = r4.cacheManager
            r1.recycle()
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r1 = r4.scrollHandle
            if (r1 == 0) goto L31
            boolean r3 = r4.isScrollHandleInit
            if (r3 == 0) goto L31
            r1.destroyLayout()
        L31:
            com.github.barteksc.pdfviewer.PdfFile r1 = r4.pdfFile
            if (r1 == 0) goto L3a
            r1.dispose()
            r4.pdfFile = r0
        L3a:
            r4.renderingHandler = r0
            r4.scrollHandle = r0
            r0 = 0
            r4.isScrollHandleInit = r0
            r0 = 0
            r4.currentYOffset = r0
            r4.currentXOffset = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.zoom = r0
            r4.recycled = r2
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = new com.github.barteksc.pdfviewer.listener.Callbacks
            r0.<init>()
            r4.callbacks = r0
            com.github.barteksc.pdfviewer.PDFView$State r0 = com.github.barteksc.pdfviewer.PDFView.State.DEFAULT
            r4.state = r0
            return
    }

    void redraw() {
            r0 = this;
            r0.invalidate()
            return
    }

    public void resetZoom() {
            r1 = this;
            float r0 = r1.minZoom
            r1.zoomTo(r0)
            return
    }

    public void resetZoomWithAnimation() {
            r1 = this;
            float r0 = r1.minZoom
            r1.zoomWithAnimation(r0)
            return
    }

    public void setMaxZoom(float r1) {
            r0 = this;
            r0.maxZoom = r1
            return
    }

    public void setMidZoom(float r1) {
            r0 = this;
            r0.midZoom = r1
            return
    }

    public void setMinZoom(float r1) {
            r0 = this;
            r0.minZoom = r1
            return
    }

    public void setNightMode(boolean r2) {
            r1 = this;
            r1.nightMode = r2
            if (r2 == 0) goto L1b
            android.graphics.ColorMatrix r2 = new android.graphics.ColorMatrix
            r0 = 20
            float[] r0 = new float[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [-1082130432, 0, 0, 0, 1132396544, 0, -1082130432, 0, 0, 1132396544, 0, 0, -1082130432, 0, 1132396544, 0, 0, 0, 1065353216, 0} // fill-array
            r2.<init>(r0)
            android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
            r0.<init>(r2)
            android.graphics.Paint r2 = r1.paint
            r2.setColorFilter(r0)
            return
        L1b:
            android.graphics.Paint r2 = r1.paint
            r0 = 0
            r2.setColorFilter(r0)
            return
    }

    public void setPageFling(boolean r1) {
            r0 = this;
            r0.pageFling = r1
            return
    }

    public void setPageSnap(boolean r1) {
            r0 = this;
            r0.pageSnap = r1
            return
    }

    public void setPositionOffset(float r2) {
            r1 = this;
            r0 = 1
            r1.setPositionOffset(r2, r0)
            return
    }

    public void setPositionOffset(float r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.swipeVertical
            if (r0 == 0) goto L1b
            float r0 = r3.currentXOffset
            com.github.barteksc.pdfviewer.PdfFile r1 = r3.pdfFile
            float r2 = r3.zoom
            float r1 = r1.getDocLen(r2)
            float r1 = -r1
            int r2 = r3.getHeight()
            float r2 = (float) r2
            float r1 = r1 + r2
            float r1 = r1 * r4
            r3.moveTo(r0, r1, r5)
            goto L31
        L1b:
            com.github.barteksc.pdfviewer.PdfFile r0 = r3.pdfFile
            float r1 = r3.zoom
            float r0 = r0.getDocLen(r1)
            float r0 = -r0
            int r1 = r3.getWidth()
            float r1 = (float) r1
            float r0 = r0 + r1
            float r0 = r0 * r4
            float r4 = r3.currentYOffset
            r3.moveTo(r0, r4, r5)
        L31:
            r3.loadPageByOffset()
            return
    }

    public void setSwipeEnabled(boolean r1) {
            r0 = this;
            r0.enableSwipe = r1
            return
    }

    void showPage(int r3) {
            r2 = this;
            boolean r0 = r2.recycled
            if (r0 == 0) goto L5
            return
        L5:
            com.github.barteksc.pdfviewer.PdfFile r0 = r2.pdfFile
            int r3 = r0.determineValidPageNumberFrom(r3)
            r2.currentPage = r3
            r2.loadPages()
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r3 = r2.scrollHandle
            if (r3 == 0) goto L23
            boolean r3 = r2.documentFitsView()
            if (r3 != 0) goto L23
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r3 = r2.scrollHandle
            int r0 = r2.currentPage
            int r0 = r0 + 1
            r3.setPageNum(r0)
        L23:
            com.github.barteksc.pdfviewer.listener.Callbacks r3 = r2.callbacks
            int r0 = r2.currentPage
            com.github.barteksc.pdfviewer.PdfFile r1 = r2.pdfFile
            int r1 = r1.getPagesCount()
            r3.callOnPageChange(r0, r1)
            return
    }

    float snapOffsetForPage(int r5, com.github.barteksc.pdfviewer.util.SnapEdge r6) {
            r4 = this;
            com.github.barteksc.pdfviewer.PdfFile r0 = r4.pdfFile
            float r1 = r4.zoom
            float r0 = r0.getPageOffset(r5, r1)
            boolean r1 = r4.swipeVertical
            if (r1 == 0) goto L12
            int r1 = r4.getHeight()
        L10:
            float r1 = (float) r1
            goto L17
        L12:
            int r1 = r4.getWidth()
            goto L10
        L17:
            com.github.barteksc.pdfviewer.PdfFile r2 = r4.pdfFile
            float r3 = r4.zoom
            float r5 = r2.getPageLength(r5, r3)
            com.github.barteksc.pdfviewer.util.SnapEdge r2 = com.github.barteksc.pdfviewer.util.SnapEdge.CENTER
            if (r6 != r2) goto L2a
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            float r0 = r0 - r1
            float r5 = r5 / r6
        L28:
            float r0 = r0 + r5
            return r0
        L2a:
            com.github.barteksc.pdfviewer.util.SnapEdge r2 = com.github.barteksc.pdfviewer.util.SnapEdge.END
            if (r6 != r2) goto L30
            float r0 = r0 - r1
            goto L28
        L30:
            return r0
    }

    public void stopFling() {
            r1 = this;
            com.github.barteksc.pdfviewer.AnimationManager r0 = r1.animationManager
            r0.stopFling()
            return
    }

    public float toCurrentScale(float r2) {
            r1 = this;
            float r0 = r1.zoom
            float r2 = r2 * r0
            return r2
    }

    public float toRealScale(float r2) {
            r1 = this;
            float r0 = r1.zoom
            float r2 = r2 / r0
            return r2
    }

    public void useBestQuality(boolean r1) {
            r0 = this;
            r0.bestQuality = r1
            return
    }

    public void zoomCenteredRelativeTo(float r2, android.graphics.PointF r3) {
            r1 = this;
            float r0 = r1.zoom
            float r0 = r0 * r2
            r1.zoomCenteredTo(r0, r3)
            return
    }

    public void zoomCenteredTo(float r5, android.graphics.PointF r6) {
            r4 = this;
            float r0 = r4.zoom
            float r0 = r5 / r0
            r4.zoomTo(r5)
            float r5 = r4.currentXOffset
            float r5 = r5 * r0
            float r1 = r4.currentYOffset
            float r1 = r1 * r0
            float r2 = r6.x
            float r3 = r2 * r0
            float r2 = r2 - r3
            float r5 = r5 + r2
            float r6 = r6.y
            float r0 = r0 * r6
            float r6 = r6 - r0
            float r1 = r1 + r6
            r4.moveTo(r5, r1)
            return
    }

    public void zoomTo(float r1) {
            r0 = this;
            r0.zoom = r1
            return
    }

    public void zoomWithAnimation(float r5) {
            r4 = this;
            com.github.barteksc.pdfviewer.AnimationManager r0 = r4.animationManager
            int r1 = r4.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r2 = r4.getHeight()
            int r2 = r2 / 2
            float r2 = (float) r2
            float r3 = r4.zoom
            r0.startZoomAnimation(r1, r2, r3, r5)
            return
    }

    public void zoomWithAnimation(float r3, float r4, float r5) {
            r2 = this;
            com.github.barteksc.pdfviewer.AnimationManager r0 = r2.animationManager
            float r1 = r2.zoom
            r0.startZoomAnimation(r3, r4, r1, r5)
            return
    }
}
