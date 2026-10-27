package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsScanAnalyzerOptions {
    public final boolean errorCheck;
    public final int mode;
    public final boolean parseResult;
    public final boolean photoMode;
    public final boolean showGuide;
    public final int viewType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Creator {
        private boolean errorCheck;
        private boolean parseResult;
        private boolean photoMode;
        private boolean showGuide;
        private int type;
        private int viewType;

        public Creator() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.type = r0
                r2.photoMode = r0
                r2.viewType = r0
                r2.errorCheck = r0
                r1 = 1
                r2.parseResult = r1
                r2.showGuide = r0
                return
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions create() {
                r8 = this;
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r0 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions
                int r1 = r8.type
                boolean r2 = r8.photoMode
                int r3 = r8.viewType
                boolean r4 = r8.errorCheck
                boolean r5 = r8.parseResult
                boolean r6 = r8.showGuide
                r7 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.Creator setErrorCheck(boolean r1) {
                r0 = this;
                r0.errorCheck = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.Creator setHmsScanTypes(int r4, int... r5) {
                r3 = this;
                int r4 = com.huawei.hms.scankit.p.w7.a(r4)
                r3.type = r4
                if (r5 == 0) goto L23
                int r0 = r5.length
                if (r0 <= 0) goto L23
                int r4 = com.huawei.hms.scankit.p.w7.b(r4)
                r3.type = r4
                int r4 = r5.length
                r0 = 0
            L13:
                if (r0 >= r4) goto L23
                r1 = r5[r0]
                int r1 = com.huawei.hms.scankit.p.w7.b(r1)
                int r2 = r3.type
                r1 = r1 | r2
                r3.type = r1
                int r0 = r0 + 1
                goto L13
            L23:
                return r3
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.Creator setParseResult(boolean r1) {
                r0 = this;
                r0.parseResult = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.Creator setPhotoMode(boolean r1) {
                r0 = this;
                r0.photoMode = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.Creator setShowGuide(boolean r1) {
                r0 = this;
                r0.showGuide = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.Creator setViewType(int r1) {
                r0 = this;
                r0.viewType = r1
                return r0
        }
    }

    private HmsScanAnalyzerOptions(int r1, boolean r2, int r3, boolean r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.mode = r1
            r0.photoMode = r2
            r0.viewType = r3
            r0.errorCheck = r4
            r0.parseResult = r5
            r0.showGuide = r6
            return
    }

    /* synthetic */ HmsScanAnalyzerOptions(int r1, boolean r2, int r3, boolean r4, boolean r5, boolean r6, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }
}
