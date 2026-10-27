package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsScanAnalyzer extends com.huawei.hms.mlsdk.common.MLAnalyzer<com.huawei.hms.ml.scan.HmsScan> {
    private static final java.lang.String TAG = "HmsScanAnalyzer";
    private android.content.Context mContext;
    private com.huawei.hms.ml.scan.HmsScanAnalyzerOptions mlVisionScanDetectorOptions;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Creator {
        private android.content.Context mContext;
        private com.huawei.hms.ml.scan.HmsScanAnalyzerOptions mOptions;

        public Creator() {
                r1 = this;
                r1.<init>()
                com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
                android.content.Context r0 = r0.getContext()
                r1.mContext = r0
                return
        }

        public Creator(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                return
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzer create() {
                r5 = this;
                com.huawei.hms.ml.scan.HmsScanAnalyzer r0 = new com.huawei.hms.ml.scan.HmsScanAnalyzer
                android.content.Context r1 = r5.mContext
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r5.mOptions
                if (r2 != 0) goto L18
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
                r2.<init>()
                r3 = 0
                int[] r4 = new int[r3]
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = r2.setHmsScanTypes(r3, r4)
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r2.create()
            L18:
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzer.Creator setHmsScanTypes(int r2, int... r3) {
                r1 = this;
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r0 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = r0.setHmsScanTypes(r2, r3)
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r2.create()
                r1.mOptions = r2
                return r1
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzer.Creator setHmsScanTypes(com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r3) {
                r2 = this;
                if (r3 != 0) goto L15
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r3 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
                r3.<init>()
                r0 = 0
                int[] r1 = new int[r0]
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r3 = r3.setHmsScanTypes(r0, r1)
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r3 = r3.create()
                r2.mOptions = r3
                return r2
            L15:
                r2.mOptions = r3
                return r2
        }
    }

    public HmsScanAnalyzer() {
            r2 = this;
            r2.<init>()
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
            if (r0 == 0) goto L14
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
            android.content.Context r0 = r0.getContext()
            r2.mContext = r0
            return
        L14:
            java.lang.String r0 = "HmsScanAnalyzer"
            java.lang.String r1 = "AGConnectInstanceImpl contect is null"
            com.huawei.hms.scankit.p.o4.e(r0, r1)
            return
    }

    private HmsScanAnalyzer(android.content.Context r1, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mlVisionScanDetectorOptions = r2
            return
    }

    /* synthetic */ HmsScanAnalyzer(android.content.Context r1, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2, com.huawei.hms.ml.scan.HmsScanAnalyzer.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public HmsScanAnalyzer(com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2) {
            r1 = this;
            r1.<init>()
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
            android.content.Context r0 = r0.getContext()
            r1.mContext = r0
            r1.mlVisionScanDetectorOptions = r2
            return
    }

    static /* synthetic */ android.content.Context access$000(com.huawei.hms.ml.scan.HmsScanAnalyzer r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.huawei.hms.ml.scan.HmsScanAnalyzerOptions access$100(com.huawei.hms.ml.scan.HmsScanAnalyzer r0) {
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r0 = r0.mlVisionScanDetectorOptions
            return r0
    }

    @Override // com.huawei.hms.mlsdk.common.MLAnalyzer
    public android.util.SparseArray<com.huawei.hms.ml.scan.HmsScan> analyseFrame(com.huawei.hms.mlsdk.common.MLFrame r5) {
            r4 = this;
            java.lang.String r0 = "start analyseFrame"
            java.lang.String r1 = "scankit mul"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            if (r5 != 0) goto Lf
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            return r5
        Lf:
            android.content.Context r0 = r4.mContext
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r4.mlVisionScanDetectorOptions
            com.huawei.hms.ml.scan.HmsScan[] r5 = com.huawei.hms.hmsscankit.ScanUtil.detectForHmsDector(r0, r5, r2)
            java.lang.String r0 = "analyseFrame end"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 0
        L22:
            int r2 = r5.length
            if (r1 >= r2) goto L3d
            r2 = r5[r1]
            if (r2 == 0) goto L3a
            java.lang.String r3 = r2.originalValue
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3a
            java.lang.String r3 = r2.originalValue
            int r3 = r3.hashCode()
            r0.append(r3, r2)
        L3a:
            int r1 = r1 + 1
            goto L22
        L3d:
            return r0
    }

    public com.huawei.hmf.tasks.k<java.util.List<com.huawei.hms.ml.scan.HmsScan>> analyzInAsyn(com.huawei.hms.mlsdk.common.MLFrame r2) {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScanAnalyzer$1 r0 = new com.huawei.hms.ml.scan.HmsScanAnalyzer$1
            r0.<init>(r1, r2)
            com.huawei.hmf.tasks.k r2 = com.huawei.hmf.tasks.n.e(r0)
            return r2
    }

    public void destory() throws java.io.IOException {
            r0 = this;
            super.destroy()
            return
    }

    @Override // com.huawei.hms.mlsdk.common.MLAnalyzer
    public boolean isAvailable() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            boolean r0 = com.huawei.hms.hmsscankit.ScanUtil.isScanAvailable(r0)
            return r0
    }
}
