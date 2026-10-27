package com.umeng.socialize.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QueuedWork {
    public static boolean isUseThreadPool;
    private static java.util.concurrent.ExecutorService mLogicExecutor;
    private static java.util.concurrent.ExecutorService mNetExecutor;
    private static android.os.Handler uiHandler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class DialogThread<T> extends com.umeng.socialize.common.QueuedWork.UMAsyncTask {
        android.app.Dialog dialog;

        public DialogThread(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r1 = 0
                r0.dialog = r1
                return
        }

        @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
        protected void onPostExecute(java.lang.Object r1) {
                r0 = this;
                super.onPostExecute(r1)
                android.app.Dialog r1 = r0.dialog
                com.umeng.socialize.utils.SocializeUtils.safeCloseDialog(r1)
                return
        }

        @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
        protected void onPreExecute() {
                r1 = this;
                super.onPreExecute()
                android.app.Dialog r0 = r1.dialog
                com.umeng.socialize.utils.SocializeUtils.safeShowDialog(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class UMAsyncTask<Result> {
        protected java.lang.Runnable thread;



        public UMAsyncTask() {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract Result doInBackground();

        public final com.umeng.socialize.common.QueuedWork.UMAsyncTask<Result> execute() {
                r2 = this;
                com.umeng.socialize.common.QueuedWork$UMAsyncTask$1 r0 = new com.umeng.socialize.common.QueuedWork$UMAsyncTask$1
                r0.<init>(r2)
                r2.thread = r0
                com.umeng.socialize.common.QueuedWork$UMAsyncTask$2 r0 = new com.umeng.socialize.common.QueuedWork$UMAsyncTask$2
                r0.<init>(r2)
                com.umeng.socialize.common.QueuedWork.runInMain(r0)
                java.lang.Runnable r0 = r2.thread
                r1 = 0
                com.umeng.socialize.common.QueuedWork.runInBack(r0, r1)
                return r2
        }

        protected void onPostExecute(Result r1) {
                r0 = this;
                return
        }

        protected void onPreExecute() {
                r0 = this;
                return
        }
    }

    static {
            r0 = 5
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            com.umeng.socialize.common.QueuedWork.mLogicExecutor = r1
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            com.umeng.socialize.common.QueuedWork.mNetExecutor = r0
            return
    }

    public QueuedWork() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void runInBack(java.lang.Runnable r1, boolean r2) {
            boolean r0 = com.umeng.socialize.common.QueuedWork.isUseThreadPool
            if (r0 == 0) goto L12
            if (r2 == 0) goto Lc
            java.util.concurrent.ExecutorService r2 = com.umeng.socialize.common.QueuedWork.mNetExecutor
            r2.execute(r1)
            return
        Lc:
            java.util.concurrent.ExecutorService r2 = com.umeng.socialize.common.QueuedWork.mLogicExecutor
            r2.execute(r1)
            return
        L12:
            java.lang.Thread r2 = new java.lang.Thread
            r2.<init>(r1)
            r2.start()
            return
    }

    public static void runInMain(java.lang.Runnable r2) {
            android.os.Handler r0 = com.umeng.socialize.common.QueuedWork.uiHandler
            if (r0 != 0) goto Lf
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.umeng.socialize.common.QueuedWork.uiHandler = r0
        Lf:
            android.os.Handler r0 = com.umeng.socialize.common.QueuedWork.uiHandler
            r0.post(r2)
            return
    }
}
