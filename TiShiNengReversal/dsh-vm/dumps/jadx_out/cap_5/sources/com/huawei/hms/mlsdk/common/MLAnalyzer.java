package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class MLAnalyzer<T> {
    private java.util.List<com.huawei.hms.mlsdk.common.AnalyzerMonitor> monitors;
    private final java.lang.Object syncAnalyzer;
    private com.huawei.hms.mlsdk.common.MLAnalyzer.MLTransactor<T> transactor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MLTransactor<T> {
        void destroy();

        void transactResult(com.huawei.hms.mlsdk.common.MLAnalyzer.Result<T> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Result<T> {
        private android.util.SparseArray<T> analyseList;
        private com.huawei.hms.mlsdk.common.MLFrame.Property frameProperty;
        private boolean isAnalyzerAvailable;

        public Result(android.util.SparseArray<T> r1, com.huawei.hms.mlsdk.common.MLFrame.Property r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.analyseList = r1
                r0.frameProperty = r2
                r0.isAnalyzerAvailable = r3
                return
        }

        public android.util.SparseArray<T> getAnalyseList() {
                r1 = this;
                android.util.SparseArray<T> r0 = r1.analyseList
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLFrame.Property getFrameProperty() {
                r1 = this;
                com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r1.frameProperty
                return r0
        }

        public boolean isAnalyzerAvaliable() {
                r1 = this;
                boolean r0 = r1.isAnalyzerAvailable
                return r0
        }
    }

    public MLAnalyzer() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.monitors = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.syncAnalyzer = r0
            return
    }

    public abstract android.util.SparseArray<T> analyseFrame(com.huawei.hms.mlsdk.common.MLFrame r1);

    public void destroy() {
            r2 = this;
            java.lang.Object r0 = r2.syncAnalyzer
            monitor-enter(r0)
            com.huawei.hms.mlsdk.common.MLAnalyzer$MLTransactor<T> r1 = r2.transactor     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.destroy()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r2.transactor = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    protected com.huawei.hms.mlsdk.common.MLFrame.Property.Ext getFramePropertyExt(com.huawei.hms.mlsdk.common.MLFrame r2) {
            r1 = this;
            if (r2 == 0) goto L12
            com.huawei.hms.mlsdk.common.MLFrame$Property r0 = r2.acquireProperty()
            if (r0 != 0) goto L9
            goto L12
        L9:
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r2.acquireProperty()
            com.huawei.hms.mlsdk.common.MLFrame$Property$Ext r2 = r2.getExt()
            return r2
        L12:
            r2 = 0
            return r2
    }

    public boolean hasMonitorRegistered() {
            r1 = this;
            java.util.List<com.huawei.hms.mlsdk.common.AnalyzerMonitor> r0 = r1.monitors
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean isAvailable() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void obtainPicture(com.huawei.hms.mlsdk.common.MLFrame r5) {
            r4 = this;
            java.lang.Object r0 = r4.syncAnalyzer
            monitor-enter(r0)
            com.huawei.hms.mlsdk.common.MLAnalyzer$MLTransactor<T> r1 = r4.transactor     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            com.huawei.hms.mlsdk.common.MLFrame$Property r1 = new com.huawei.hms.mlsdk.common.MLFrame$Property     // Catch: java.lang.Throwable -> L27
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r5.acquireProperty()     // Catch: java.lang.Throwable -> L27
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27
            r1.resetWidthAndHeight()     // Catch: java.lang.Throwable -> L27
            com.huawei.hms.mlsdk.common.MLAnalyzer$Result r2 = new com.huawei.hms.mlsdk.common.MLAnalyzer$Result     // Catch: java.lang.Throwable -> L27
            android.util.SparseArray r5 = r4.analyseFrame(r5)     // Catch: java.lang.Throwable -> L27
            boolean r3 = r4.isAvailable()     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L27
            com.huawei.hms.mlsdk.common.MLAnalyzer$MLTransactor<T> r5 = r4.transactor     // Catch: java.lang.Throwable -> L27
            r5.transactResult(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r5 = move-exception
            goto L31
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Transactor must be specified first to receive detection results."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L27
            throw r5     // Catch: java.lang.Throwable -> L27
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r5
    }

    public void postMonitorEvent(com.huawei.hms.mlsdk.common.internal.client.event.MonitorEvent r3) {
            r2 = this;
            java.util.List<com.huawei.hms.mlsdk.common.AnalyzerMonitor> r0 = r2.monitors
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.huawei.hms.mlsdk.common.AnalyzerMonitor r1 = (com.huawei.hms.mlsdk.common.AnalyzerMonitor) r1
            if (r1 != 0) goto L15
            goto L6
        L15:
            r1.receive(r3)
            goto L6
        L19:
            return
    }

    public void registerMonitor(com.huawei.hms.mlsdk.common.AnalyzerMonitor r2) {
            r1 = this;
            java.util.List<com.huawei.hms.mlsdk.common.AnalyzerMonitor> r0 = r1.monitors
            r0.add(r2)
            return
    }

    public void setTransactor(com.huawei.hms.mlsdk.common.MLAnalyzer.MLTransactor<T> r2) {
            r1 = this;
            java.lang.Object r0 = r1.syncAnalyzer
            monitor-enter(r0)
            r1.transactor = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public boolean traceItem(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void unregisterMonitor(com.huawei.hms.mlsdk.common.AnalyzerMonitor r2) {
            r1 = this;
            java.util.List<com.huawei.hms.mlsdk.common.AnalyzerMonitor> r0 = r1.monitors
            r0.remove(r2)
            return
    }
}
