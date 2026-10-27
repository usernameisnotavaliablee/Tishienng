package androidx.asynclayoutinflater.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AsyncLayoutInflater {
    private static final java.lang.String TAG = "AsyncLayoutInflater";
    android.os.Handler mHandler;
    private android.os.Handler.Callback mHandlerCallback;
    androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread mInflateThread;
    android.view.LayoutInflater mInflater;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class BasicInflater extends android.view.LayoutInflater {
        private static final java.lang.String[] sClassPrefixList = null;

        static {
                java.lang.String r0 = "android.webkit."
                java.lang.String r1 = "android.app."
                java.lang.String r2 = "android.widget."
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                androidx.asynclayoutinflater.view.AsyncLayoutInflater.BasicInflater.sClassPrefixList = r0
                return
        }

        BasicInflater(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.LayoutInflater
        public android.view.LayoutInflater cloneInContext(android.content.Context r2) {
                r1 = this;
                androidx.asynclayoutinflater.view.AsyncLayoutInflater$BasicInflater r0 = new androidx.asynclayoutinflater.view.AsyncLayoutInflater$BasicInflater
                r0.<init>(r2)
                return r0
        }

        @Override // android.view.LayoutInflater
        protected android.view.View onCreateView(java.lang.String r5, android.util.AttributeSet r6) throws java.lang.ClassNotFoundException {
                r4 = this;
                java.lang.String[] r0 = androidx.asynclayoutinflater.view.AsyncLayoutInflater.BasicInflater.sClassPrefixList
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                android.view.View r3 = r4.createView(r5, r3, r6)     // Catch: java.lang.ClassNotFoundException -> Lf
                if (r3 == 0) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L4
            L12:
                android.view.View r5 = super.onCreateView(r5, r6)
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InflateRequest {
        androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener callback;
        androidx.asynclayoutinflater.view.AsyncLayoutInflater inflater;
        android.view.ViewGroup parent;
        int resid;
        android.view.View view;

        InflateRequest() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InflateThread extends java.lang.Thread {
        private static final androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread sInstance = null;
        private java.util.concurrent.ArrayBlockingQueue<androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest> mQueue;
        private androidx.core.util.Pools.SynchronizedPool<androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest> mRequestPool;

        static {
                androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread r0 = new androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread
                r0.<init>()
                androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread.sInstance = r0
                r0.start()
                return
        }

        private InflateThread() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
                r1 = 10
                r0.<init>(r1)
                r2.mQueue = r0
                androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
                r0.<init>(r1)
                r2.mRequestPool = r0
                return
        }

        public static androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread getInstance() {
                androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread r0 = androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread.sInstance
                return r0
        }

        public void enqueue(androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest r3) {
                r2 = this;
                java.util.concurrent.ArrayBlockingQueue<androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest> r0 = r2.mQueue     // Catch: java.lang.InterruptedException -> L6
                r0.put(r3)     // Catch: java.lang.InterruptedException -> L6
                return
            L6:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Failed to enqueue async inflate request"
                r0.<init>(r1, r3)
                throw r0
        }

        public androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest obtainRequest() {
                r1 = this;
                androidx.core.util.Pools$SynchronizedPool<androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest> r0 = r1.mRequestPool
                java.lang.Object r0 = r0.acquire()
                androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest r0 = (androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest) r0
                if (r0 != 0) goto Lf
                androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest r0 = new androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest
                r0.<init>()
            Lf:
                return r0
        }

        public void releaseRequest(androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest r3) {
                r2 = this;
                r0 = 0
                r3.callback = r0
                r3.inflater = r0
                r3.parent = r0
                r1 = 0
                r3.resid = r1
                r3.view = r0
                androidx.core.util.Pools$SynchronizedPool<androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest> r0 = r2.mRequestPool
                r0.release(r3)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
            L0:
                r0.runInner()
                goto L0
        }

        public void runInner() {
                r5 = this;
                java.util.concurrent.ArrayBlockingQueue<androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest> r0 = r5.mQueue     // Catch: java.lang.InterruptedException -> L22
                java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> L22
                androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest r0 = (androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateRequest) r0     // Catch: java.lang.InterruptedException -> L22
                r1 = 0
                androidx.asynclayoutinflater.view.AsyncLayoutInflater r2 = r0.inflater     // Catch: java.lang.RuntimeException -> L17
                android.view.LayoutInflater r2 = r2.mInflater     // Catch: java.lang.RuntimeException -> L17
                int r3 = r0.resid     // Catch: java.lang.RuntimeException -> L17
                android.view.ViewGroup r4 = r0.parent     // Catch: java.lang.RuntimeException -> L17
                android.view.View r2 = r2.inflate(r3, r4, r1)     // Catch: java.lang.RuntimeException -> L17
                r0.view = r2     // Catch: java.lang.RuntimeException -> L17
            L17:
                androidx.asynclayoutinflater.view.AsyncLayoutInflater r2 = r0.inflater
                android.os.Handler r2 = r2.mHandler
                android.os.Message r0 = android.os.Message.obtain(r2, r1, r0)
                r0.sendToTarget()
            L22:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnInflateFinishedListener {
        void onInflateFinished(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.LayoutRes int r2, @androidx.annotation.Nullable android.view.ViewGroup r3);
    }

    public AsyncLayoutInflater(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            androidx.asynclayoutinflater.view.AsyncLayoutInflater$1 r0 = new androidx.asynclayoutinflater.view.AsyncLayoutInflater$1
            r0.<init>(r1)
            r1.mHandlerCallback = r0
            androidx.asynclayoutinflater.view.AsyncLayoutInflater$BasicInflater r0 = new androidx.asynclayoutinflater.view.AsyncLayoutInflater$BasicInflater
            r0.<init>(r2)
            r1.mInflater = r0
            android.os.Handler r2 = new android.os.Handler
            android.os.Handler$Callback r0 = r1.mHandlerCallback
            r2.<init>(r0)
            r1.mHandler = r2
            androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread r2 = androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread.getInstance()
            r1.mInflateThread = r2
            return
    }

    @androidx.annotation.UiThread
    public void inflate(@androidx.annotation.LayoutRes int r2, @androidx.annotation.Nullable android.view.ViewGroup r3, @androidx.annotation.NonNull androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener r4) {
            r1 = this;
            if (r4 == 0) goto L16
            androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread r0 = r1.mInflateThread
            androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateRequest r0 = r0.obtainRequest()
            r0.inflater = r1
            r0.resid = r2
            r0.parent = r3
            r0.callback = r4
            androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread r2 = r1.mInflateThread
            r2.enqueue(r0)
            return
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "callback argument may not be null!"
            r2.<init>(r3)
            throw r2
    }
}
