package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsScanFrameOptions {
    private boolean multiMode;
    private boolean parseResult;
    private boolean photoMode;
    private int type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.ml.scan.HmsScanFrameOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Creator {
        private boolean multiMode;
        private boolean parseResult;
        private boolean photoMode;
        private int type;

        public Creator() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.type = r0
                r1.multiMode = r0
                r1.photoMode = r0
                r0 = 1
                r1.parseResult = r0
                return
        }

        public com.huawei.hms.ml.scan.HmsScanFrameOptions create() {
                r6 = this;
                com.huawei.hms.ml.scan.HmsScanFrameOptions r0 = new com.huawei.hms.ml.scan.HmsScanFrameOptions
                int r1 = r6.type
                boolean r2 = r6.photoMode
                boolean r3 = r6.multiMode
                boolean r4 = r6.parseResult
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanFrameOptions.Creator setHmsScanTypes(int r4, int... r5) {
                r3 = this;
                r3.type = r4
                if (r5 == 0) goto L15
                int r4 = r5.length
                if (r4 <= 0) goto L15
                int r4 = r5.length
                r0 = 0
            L9:
                if (r0 >= r4) goto L15
                r1 = r5[r0]
                int r2 = r3.type
                r1 = r1 | r2
                r3.type = r1
                int r0 = r0 + 1
                goto L9
            L15:
                return r3
        }

        public com.huawei.hms.ml.scan.HmsScanFrameOptions.Creator setMultiMode(boolean r1) {
                r0 = this;
                r0.multiMode = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanFrameOptions.Creator setParseResult(boolean r1) {
                r0 = this;
                r0.parseResult = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScanFrameOptions.Creator setPhotoMode(boolean r1) {
                r0 = this;
                r0.photoMode = r1
                return r0
        }
    }

    private HmsScanFrameOptions(int r1, boolean r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.photoMode = r2
            r0.multiMode = r3
            r0.parseResult = r4
            return
    }

    /* synthetic */ HmsScanFrameOptions(int r1, boolean r2, boolean r3, boolean r4, com.huawei.hms.ml.scan.HmsScanFrameOptions.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public boolean isMultiMode() {
            r1 = this;
            boolean r0 = r1.multiMode
            return r0
    }

    public boolean isParseResult() {
            r1 = this;
            boolean r0 = r1.parseResult
            return r0
    }

    public boolean isPhotoMode() {
            r1 = this;
            boolean r0 = r1.photoMode
            return r0
    }
}
