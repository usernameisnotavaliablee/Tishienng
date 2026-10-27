package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MessageThreadUtil<T> implements androidx.recyclerview.widget.ThreadUtil<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> {
        static final int ADD_TILE = 2;
        static final int REMOVE_TILE = 3;
        static final int UPDATE_ITEM_COUNT = 1;
        private final android.os.Handler mMainThreadHandler;
        private java.lang.Runnable mMainThreadRunnable;
        final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue mQueue;
        final /* synthetic */ androidx.recyclerview.widget.MessageThreadUtil this$0;
        final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.MainThreadCallback val$callback;


        AnonymousClass1(androidx.recyclerview.widget.MessageThreadUtil r1, androidx.recyclerview.widget.ThreadUtil.MainThreadCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$callback = r2
                r0.<init>()
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r1 = new androidx.recyclerview.widget.MessageThreadUtil$MessageQueue
                r1.<init>()
                r0.mQueue = r1
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.mMainThreadHandler = r1
                androidx.recyclerview.widget.MessageThreadUtil$1$1 r1 = new androidx.recyclerview.widget.MessageThreadUtil$1$1
                r1.<init>(r0)
                r0.mMainThreadRunnable = r1
                return
        }

        private void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r0 = r1.mQueue
                r0.sendMessage(r2)
                android.os.Handler r2 = r1.mMainThreadHandler
                java.lang.Runnable r0 = r1.mMainThreadRunnable
                r2.post(r0)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int r2, androidx.recyclerview.widget.TileList.Tile<T> r3) {
                r1 = this;
                r0 = 2
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int r2, int r3) {
                r1 = this;
                r0 = 3
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int r2, int r3) {
                r1 = this;
                r0 = 1
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> {
        static final int LOAD_TILE = 3;
        static final int RECYCLE_TILE = 4;
        static final int REFRESH = 1;
        static final int UPDATE_RANGE = 2;
        private java.lang.Runnable mBackgroundRunnable;
        java.util.concurrent.atomic.AtomicBoolean mBackgroundRunning;
        private final java.util.concurrent.Executor mExecutor;
        final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue mQueue;
        final /* synthetic */ androidx.recyclerview.widget.MessageThreadUtil this$0;
        final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.BackgroundCallback val$callback;


        AnonymousClass2(androidx.recyclerview.widget.MessageThreadUtil r1, androidx.recyclerview.widget.ThreadUtil.BackgroundCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$callback = r2
                r0.<init>()
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r1 = new androidx.recyclerview.widget.MessageThreadUtil$MessageQueue
                r1.<init>()
                r0.mQueue = r1
                java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                r0.mExecutor = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 0
                r1.<init>(r2)
                r0.mBackgroundRunning = r1
                androidx.recyclerview.widget.MessageThreadUtil$2$1 r1 = new androidx.recyclerview.widget.MessageThreadUtil$2$1
                r1.<init>(r0)
                r0.mBackgroundRunnable = r1
                return
        }

        private void maybeExecuteBackgroundRunnable() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.mBackgroundRunning
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L11
                java.util.concurrent.Executor r0 = r3.mExecutor
                java.lang.Runnable r1 = r3.mBackgroundRunnable
                r0.execute(r1)
            L11:
                return
        }

        private void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r0 = r1.mQueue
                r0.sendMessage(r2)
                r1.maybeExecuteBackgroundRunnable()
                return
        }

        private void sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r0 = r1.mQueue
                r0.sendMessageAtFrontOfQueue(r2)
                r1.maybeExecuteBackgroundRunnable()
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int r2, int r3) {
                r1 = this;
                r0 = 3
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> r3) {
                r2 = this;
                r0 = 4
                r1 = 0
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r3 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r1, r3)
                r2.sendMessage(r3)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r3 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r3, r1)
                r2.sendMessageAtFrontOfQueue(r3)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int r8, int r9, int r10, int r11, int r12) {
                r7 = this;
                r0 = 2
                r6 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r8 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r1, r2, r3, r4, r5, r6)
                r7.sendMessageAtFrontOfQueue(r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MessageQueue {
        private final java.lang.Object mLock;
        private androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem mRoot;

        MessageQueue() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                return
        }

        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r3.mRoot     // Catch: java.lang.Throwable -> La
                if (r1 != 0) goto Lc
                r1 = 0
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return r1
            La:
                r1 = move-exception
                goto L12
            Lc:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> La
                r3.mRoot = r2     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return r1
            L12:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r1
        }

        void removeMessages(int r6) {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
            L3:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r5.mRoot     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L15
                int r2 = r1.what     // Catch: java.lang.Throwable -> L13
                if (r2 != r6) goto L15
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> L13
                r5.mRoot = r2     // Catch: java.lang.Throwable -> L13
                r1.recycle()     // Catch: java.lang.Throwable -> L13
                goto L3
            L13:
                r6 = move-exception
                goto L2c
            L15:
                if (r1 == 0) goto L2a
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> L13
            L19:
                if (r2 == 0) goto L2a
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r3 = r2.next     // Catch: java.lang.Throwable -> L13
                int r4 = r2.what     // Catch: java.lang.Throwable -> L13
                if (r4 != r6) goto L27
                r1.next = r3     // Catch: java.lang.Throwable -> L13
                r2.recycle()     // Catch: java.lang.Throwable -> L13
                goto L28
            L27:
                r1 = r2
            L28:
                r2 = r3
                goto L19
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L2c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r6
        }

        void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r3.mRoot     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                r3.mRoot = r4     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            Lb:
                r4 = move-exception
                goto L17
            Ld:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> Lb
                if (r2 == 0) goto L13
                r1 = r2
                goto Ld
            L13:
                r1.next = r4     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r4
        }

        void sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r3) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r2.mRoot     // Catch: java.lang.Throwable -> Lb
                r3.next = r1     // Catch: java.lang.Throwable -> Lb
                r2.mRoot = r3     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            Lb:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SyncQueueItem {
        private static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem sPool;
        private static final java.lang.Object sPoolLock = null;
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public java.lang.Object data;
        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next;
        public int what;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPoolLock = r0
                return
        }

        SyncQueueItem() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int r7, int r8, int r9) {
                r5 = 0
                r6 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r7 = obtainMessage(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int r3, int r4, int r5, int r6, int r7, int r8, java.lang.Object r9) {
                java.lang.Object r0 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPoolLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool     // Catch: java.lang.Throwable -> Ld
                if (r1 != 0) goto Lf
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = new androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem     // Catch: java.lang.Throwable -> Ld
                r1.<init>()     // Catch: java.lang.Throwable -> Ld
                goto L16
            Ld:
                r3 = move-exception
                goto L26
            Lf:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> Ld
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool = r2     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                r1.next = r2     // Catch: java.lang.Throwable -> Ld
            L16:
                r1.what = r3     // Catch: java.lang.Throwable -> Ld
                r1.arg1 = r4     // Catch: java.lang.Throwable -> Ld
                r1.arg2 = r5     // Catch: java.lang.Throwable -> Ld
                r1.arg3 = r6     // Catch: java.lang.Throwable -> Ld
                r1.arg4 = r7     // Catch: java.lang.Throwable -> Ld
                r1.arg5 = r8     // Catch: java.lang.Throwable -> Ld
                r1.data = r9     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            L26:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int r7, int r8, java.lang.Object r9) {
                r4 = 0
                r5 = 0
                r2 = 0
                r3 = 0
                r0 = r7
                r1 = r8
                r6 = r9
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r7 = obtainMessage(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        void recycle() {
                r2 = this;
                r0 = 0
                r2.next = r0
                r1 = 0
                r2.arg5 = r1
                r2.arg4 = r1
                r2.arg3 = r1
                r2.arg2 = r1
                r2.arg1 = r1
                r2.what = r1
                r2.data = r0
                java.lang.Object r0 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPoolLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1e
                r2.next = r1     // Catch: java.lang.Throwable -> L1c
                goto L1e
            L1c:
                r1 = move-exception
                goto L22
            L1e:
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool = r2     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L22:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r1
        }
    }

    MessageThreadUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getBackgroundProxy(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.MessageThreadUtil$2 r0 = new androidx.recyclerview.widget.MessageThreadUtil$2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getMainThreadProxy(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.MessageThreadUtil$1 r0 = new androidx.recyclerview.widget.MessageThreadUtil$1
            r0.<init>(r1, r2)
            return r0
    }
}
