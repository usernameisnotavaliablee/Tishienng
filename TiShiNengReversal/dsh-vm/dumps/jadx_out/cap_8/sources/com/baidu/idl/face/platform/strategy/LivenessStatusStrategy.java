package com.baidu.idl.face.platform.strategy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class LivenessStatusStrategy {
    private static final java.lang.String TAG = "LivenessStatusStrategy";
    private volatile com.baidu.idl.face.platform.LivenessTypeEnum mCurrentLivenessTypeEnum;
    private long mFaceID;
    private long mLivenessDuration;
    private volatile int mLivenessIndex;
    private java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> mLivenessList;
    private java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> mLivenessStatusMap;
    private long mLivenessTimeDuration;
    private boolean mLivenessTimeoutFlag;
    private long mQualityDuration;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.idl.face.platform.strategy.LivenessStatusStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum = null;

        static {
                com.baidu.idl.face.platform.LivenessTypeEnum[] r0 = com.baidu.idl.face.platform.LivenessTypeEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum = r0
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L1d
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L28
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L33
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L3e
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L49
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public LivenessStatusStrategy() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mLivenessIndex = r0
            r3.mLivenessTimeoutFlag = r0
            r1 = 0
            r3.mCurrentLivenessTypeEnum = r1
            r1 = -1
            r3.mFaceID = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mLivenessStatusMap = r1
            r1 = 0
            r3.mQualityDuration = r1
            r3.mLivenessTimeDuration = r1
            r3.mLivenessIndex = r0
            r3.mLivenessDuration = r1
            return
    }

    private void clearLivenessStatus() {
            r4 = this;
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r0 = r4.mLivenessStatusMap
            r0.clear()
            r0 = 0
        L6:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1 = r4.mLivenessList
            int r1 = r1.size()
            if (r0 >= r1) goto L1e
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r1 = r4.mLivenessStatusMap
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r2 = r4.mLivenessList
            java.lang.Object r2 = r2.get(r0)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L6
        L1e:
            return
    }

    protected int getCurrentLivenessCount() {
            r1 = this;
            int r0 = r1.mLivenessIndex
            int r0 = r0 + 1
            return r0
    }

    public com.baidu.idl.face.platform.FaceStatusNewEnum getCurrentLivenessNewStatus() {
            r2 = this;
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = r2.mCurrentLivenessTypeEnum
            if (r0 == 0) goto L24
            int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = r2.mCurrentLivenessTypeEnum
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                default: goto L11;
            }
        L11:
            goto L24
        L12:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYawRight
            return r0
        L15:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYawLeft
            return r0
        L18:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLivePitchDown
            return r0
        L1b:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLivePitchUp
            return r0
        L1e:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveMouth
            return r0
        L21:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveEye
            return r0
        L24:
            r0 = 0
            return r0
    }

    public com.baidu.idl.face.platform.LivenessTypeEnum getCurrentLivenessType() {
            r1 = this;
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = r1.mCurrentLivenessTypeEnum
            return r0
    }

    public boolean isCourseTimeout(com.baidu.idl.face.platform.FaceConfig r6) {
            r5 = this;
            long r0 = r5.mLivenessDuration
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r5.mLivenessDuration = r0
        Le:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.mLivenessDuration
            long r0 = r0 - r2
            long r2 = r6.getTimeLivenessCourse()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L1f
            r6 = 1
            return r6
        L1f:
            r6 = 0
            return r6
    }

    public boolean isCurrentLivenessSuccess() {
            r3 = this;
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r0 = r3.mLivenessStatusMap
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = r3.mCurrentLivenessTypeEnum
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r0 = r3.mLivenessStatusMap
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = r3.mCurrentLivenessTypeEnum
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L20
            r1 = 0
            r3.mLivenessTimeDuration = r1
        L20:
            return r0
    }

    protected boolean isExistNextLiveness() {
            r3 = this;
            int r0 = r3.mLivenessIndex
            r1 = 1
            int r0 = r0 + r1
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r2 = r3.mLivenessList
            int r2 = r2.size()
            if (r0 >= r2) goto Ld
            return r1
        Ld:
            r0 = 0
            return r0
    }

    public boolean isLivenessSuccess() {
            r3 = this;
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r0 = r3.mLivenessStatusMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto La
            java.lang.Object r0 = r1.getKey()
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = (com.baidu.idl.face.platform.LivenessTypeEnum) r0
            r0.name()
            r0 = 0
            goto L2e
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L34
            r1 = 0
            r3.mLivenessTimeDuration = r1
        L34:
            return r0
    }

    public boolean isTimeout() {
            r1 = this;
            boolean r0 = r1.mLivenessTimeoutFlag
            return r0
    }

    public boolean nextLiveness() {
            r4 = this;
            int r0 = r4.mLivenessIndex
            r1 = 1
            int r0 = r0 + r1
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r2 = r4.mLivenessList
            int r2 = r2.size()
            if (r0 >= r2) goto L27
            int r0 = r4.mLivenessIndex
            int r0 = r0 + r1
            r4.mLivenessIndex = r0
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = r4.mLivenessList
            int r2 = r4.mLivenessIndex
            java.lang.Object r0 = r0.get(r2)
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = (com.baidu.idl.face.platform.LivenessTypeEnum) r0
            r4.mCurrentLivenessTypeEnum = r0
            r2 = 0
            r4.mLivenessDuration = r2
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = r4.mCurrentLivenessTypeEnum
            r0.name()
            return r1
        L27:
            r0 = 0
            return r0
    }

    public void processLiveness(com.baidu.idl.face.platform.model.FaceExtInfo r6, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r7, android.graphics.Rect r8) {
            r5 = this;
            long r0 = r5.mLivenessTimeDuration
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r5.mLivenessTimeDuration = r0
        Le:
            com.baidu.idl.face.platform.FaceSDKManager r8 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.FaceConfig r8 = r8.getFaceConfig()
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.mLivenessTimeDuration
            long r0 = r0 - r2
            long r2 = r8.getTimeDetectModule()
            r8 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L29
            r5.mLivenessTimeoutFlag = r8
            return
        L29:
            if (r6 == 0) goto L222
            int r0 = r6.getFaceId()
            long r0 = (long) r0
            long r2 = r5.mFaceID
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3d
            int r0 = r6.getFaceId()
            long r0 = (long) r0
            r5.mFaceID = r0
        L3d:
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            int[] r1 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum
            com.baidu.idl.face.platform.LivenessTypeEnum r2 = r5.mCurrentLivenessTypeEnum
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L91;
                case 2: goto L84;
                case 3: goto L77;
                case 4: goto L6a;
                case 5: goto L5d;
                case 6: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L9d
        L50:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_TURN_RIGHT
            r1.processLiveness(r2, r7, r6, r0)
            r0.toString()
            goto L9d
        L5d:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_TURN_LEFT
            r1.processLiveness(r2, r7, r6, r0)
            r0.toString()
            goto L9d
        L6a:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_NOD
            r1.processLiveness(r2, r7, r6, r0)
            r0.toString()
            goto L9d
        L77:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_LOOK_UP
            r1.processLiveness(r2, r7, r6, r0)
            r0.toString()
            goto L9d
        L84:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_OPEN_MOUTH
            r1.processLiveness(r2, r7, r6, r0)
            r0.toString()
            goto L9d
        L91:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFace_ACTION_LIVE_BLINK
            r1.processLiveness(r2, r7, r6, r0)
            r0.toString()
        L9d:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6 = r5.mLivenessList
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye
            boolean r6 = r6.contains(r7)
            r1 = 0
            if (r6 == 0) goto Lc3
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto Lc3
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto Lba
            r2 = 1
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
            goto Ldf
        Lc3:
            com.baidu.idl.face.platform.LivenessTypeEnum r6 = r5.mCurrentLivenessTypeEnum
            if (r6 != r7) goto Ldf
            int r6 = r0.get()
            if (r6 != r8) goto Ldf
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto Ld7
            r2 = 1
            goto Ld8
        Ld7:
            r2 = 0
        Ld8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
        Ldf:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6 = r5.mLivenessList
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L104
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L104
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto Lfb
            r2 = 1
            goto Lfc
        Lfb:
            r2 = 0
        Lfc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
            goto L120
        L104:
            com.baidu.idl.face.platform.LivenessTypeEnum r6 = r5.mCurrentLivenessTypeEnum
            if (r6 != r7) goto L120
            int r6 = r0.get()
            if (r6 != r8) goto L120
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L118
            r2 = 1
            goto L119
        L118:
            r2 = 0
        L119:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
        L120:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6 = r5.mLivenessList
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L145
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L145
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L13c
            r2 = 1
            goto L13d
        L13c:
            r2 = 0
        L13d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
            goto L161
        L145:
            com.baidu.idl.face.platform.LivenessTypeEnum r6 = r5.mCurrentLivenessTypeEnum
            if (r6 != r7) goto L161
            int r6 = r0.get()
            if (r6 != r8) goto L161
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L159
            r2 = 1
            goto L15a
        L159:
            r2 = 0
        L15a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
        L161:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6 = r5.mLivenessList
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L186
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L186
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L17d
            r2 = 1
            goto L17e
        L17d:
            r2 = 0
        L17e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
            goto L1a2
        L186:
            com.baidu.idl.face.platform.LivenessTypeEnum r6 = r5.mCurrentLivenessTypeEnum
            if (r6 != r7) goto L1a2
            int r6 = r0.get()
            if (r6 != r8) goto L1a2
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L19a
            r2 = 1
            goto L19b
        L19a:
            r2 = 0
        L19b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
        L1a2:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6 = r5.mLivenessList
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L1c7
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L1c7
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L1be
            r2 = 1
            goto L1bf
        L1be:
            r2 = 0
        L1bf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
            goto L1e3
        L1c7:
            com.baidu.idl.face.platform.LivenessTypeEnum r6 = r5.mCurrentLivenessTypeEnum
            if (r6 != r7) goto L1e3
            int r6 = r0.get()
            if (r6 != r8) goto L1e3
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r2 = r0.get()
            if (r2 != r8) goto L1db
            r2 = 1
            goto L1dc
        L1db:
            r2 = 0
        L1dc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r2)
        L1e3:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6 = r5.mLivenessList
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L207
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L207
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r0 = r0.get()
            if (r0 != r8) goto L1fe
            goto L1ff
        L1fe:
            r8 = 0
        L1ff:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6.put(r7, r8)
            return
        L207:
            com.baidu.idl.face.platform.LivenessTypeEnum r6 = r5.mCurrentLivenessTypeEnum
            if (r6 != r7) goto L222
            int r6 = r0.get()
            if (r6 != r8) goto L222
            java.util.HashMap<com.baidu.idl.face.platform.LivenessTypeEnum, java.lang.Boolean> r6 = r5.mLivenessStatusMap
            int r0 = r0.get()
            if (r0 != r8) goto L21a
            goto L21b
        L21a:
            r8 = 0
        L21b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6.put(r7, r8)
        L222:
            return
    }

    public void reset() {
            r3 = this;
            r0 = 0
            r3.mLivenessIndex = r0
            r3.clearLivenessStatus()
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1 = r3.mLivenessList
            if (r1 == 0) goto L20
            int r1 = r3.mLivenessIndex
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r2 = r3.mLivenessList
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1 = r3.mLivenessList
            int r2 = r3.mLivenessIndex
            java.lang.Object r1 = r1.get(r2)
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = (com.baidu.idl.face.platform.LivenessTypeEnum) r1
            r3.mCurrentLivenessTypeEnum = r1
        L20:
            r1 = 0
            r3.mLivenessDuration = r1
            r3.mLivenessTimeoutFlag = r0
            r3.mLivenessTimeDuration = r1
            return
    }

    public void resetQualityTime() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.mQualityDuration = r0
            return
    }

    public void resetState() {
            r2 = this;
            r0 = 0
            r2.mLivenessDuration = r0
            return
    }

    public void setLivenessList(java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r2) {
            r1 = this;
            if (r2 == 0) goto L1b
            int r0 = r2.size()
            if (r0 <= 0) goto L1b
            r1.mLivenessList = r2
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            com.baidu.idl.face.platform.LivenessTypeEnum r2 = (com.baidu.idl.face.platform.LivenessTypeEnum) r2
            r1.mCurrentLivenessTypeEnum = r2
            com.baidu.idl.face.platform.LivenessTypeEnum r2 = r1.mCurrentLivenessTypeEnum
            java.util.Objects.toString(r2)
            r1.clearLivenessStatus()
        L1b:
            return
    }

    public boolean showQualityTips() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.mQualityDuration
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    protected void startNextLiveness() {
            r2 = this;
            int r0 = r2.mLivenessIndex
            int r0 = r0 + 1
            r2.mLivenessIndex = r0
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = r2.mLivenessList
            int r1 = r2.mLivenessIndex
            java.lang.Object r0 = r0.get(r1)
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = (com.baidu.idl.face.platform.LivenessTypeEnum) r0
            r2.mCurrentLivenessTypeEnum = r0
            r0 = 0
            r2.mLivenessDuration = r0
            return
    }
}
