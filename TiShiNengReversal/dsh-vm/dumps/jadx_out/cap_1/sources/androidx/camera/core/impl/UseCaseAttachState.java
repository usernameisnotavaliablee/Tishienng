package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class UseCaseAttachState {
    private static final java.lang.String TAG = "UseCaseAttachState";
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> mAttachedUseCasesToInfoMap;
    private final java.lang.String mCameraId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface AttachStateFilter {
        boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class UseCaseAttachInfo {
        private boolean mActive;
        private boolean mAttached;

        @androidx.annotation.NonNull
        private final androidx.camera.core.impl.SessionConfig mSessionConfig;

        @androidx.annotation.NonNull
        private final androidx.camera.core.impl.UseCaseConfig<?> mUseCaseConfig;

        UseCaseAttachInfo(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r2, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mAttached = r0
                r1.mActive = r0
                r1.mSessionConfig = r2
                r1.mUseCaseConfig = r3
                return
        }

        boolean getActive() {
                r1 = this;
                boolean r0 = r1.mActive
                return r0
        }

        boolean getAttached() {
                r1 = this;
                boolean r0 = r1.mAttached
                return r0
        }

        @androidx.annotation.NonNull
        androidx.camera.core.impl.SessionConfig getSessionConfig() {
                r1 = this;
                androidx.camera.core.impl.SessionConfig r0 = r1.mSessionConfig
                return r0
        }

        @androidx.annotation.NonNull
        androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
                r1 = this;
                androidx.camera.core.impl.UseCaseConfig<?> r0 = r1.mUseCaseConfig
                return r0
        }

        void setActive(boolean r1) {
                r0 = this;
                r0.mActive = r1
                return
        }

        void setAttached(boolean r1) {
                r0 = this;
                r0.mAttached = r1
                return
        }
    }

    public UseCaseAttachState(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.mAttachedUseCasesToInfoMap = r0
            r1.mCameraId = r2
            return
    }

    public static /* synthetic */ boolean a(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo r0) {
            boolean r0 = r0.getAttached()
            return r0
    }

    public static /* synthetic */ boolean b(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo r0) {
            boolean r0 = r0.getAttached()
            return r0
    }

    public static /* synthetic */ boolean c(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo r1) {
            boolean r0 = r1.getActive()
            if (r0 == 0) goto Le
            boolean r1 = r1.getAttached()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo getOrCreateUseCaseAttachInfo(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r4) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r1.mAttachedUseCasesToInfoMap
            java.lang.Object r0 = r0.get(r2)
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r0 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r0
            if (r0 != 0) goto L14
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r0 = new androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo
            r0.<init>(r3, r4)
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r3 = r1.mAttachedUseCasesToInfoMap
            r3.put(r2, r0)
        L14:
            return r0
    }

    private java.util.Collection<androidx.camera.core.impl.SessionConfig> getSessionConfigs(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r1 = r4.mAttachedUseCasesToInfoMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 == 0) goto L29
            java.lang.Object r3 = r2.getValue()
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r3 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r3
            boolean r3 = r5.filter(r3)
            if (r3 == 0) goto Lf
        L29:
            java.lang.Object r2 = r2.getValue()
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r2 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r2
            androidx.camera.core.impl.SessionConfig r2 = r2.getSessionConfig()
            r0.add(r2)
            goto Lf
        L37:
            return r0
    }

    private java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> getUseCaseConfigs(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r1 = r4.mAttachedUseCasesToInfoMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 == 0) goto L29
            java.lang.Object r3 = r2.getValue()
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r3 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r3
            boolean r3 = r5.filter(r3)
            if (r3 == 0) goto Lf
        L29:
            java.lang.Object r2 = r2.getValue()
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r2 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r2
            androidx.camera.core.impl.UseCaseConfig r2 = r2.getUseCaseConfig()
            r0.add(r2)
            goto Lf
        L37:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
            r6 = this;
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r0 = new androidx.camera.core.impl.SessionConfig$ValidatingBuilder
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r2 = r6.mAttachedUseCasesToInfoMap
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r4 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r4
            boolean r5 = r4.getActive()
            if (r5 == 0) goto L14
            boolean r5 = r4.getAttached()
            if (r5 == 0) goto L14
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            androidx.camera.core.impl.SessionConfig r4 = r4.getSessionConfig()
            r0.add(r4)
            r1.add(r3)
            goto L14
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Active and attached use case: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " for camera: "
            r2.append(r1)
            java.lang.String r1 = r6.mCameraId
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "UseCaseAttachState"
            androidx.camera.core.Logger.d(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Collection<androidx.camera.core.impl.SessionConfig> getActiveAndAttachedSessionConfigs() {
            r1 = this;
            androidx.camera.core.impl.m0 r0 = new androidx.camera.core.impl.m0
            r0.<init>()
            java.util.Collection r0 = r1.getSessionConfigs(r0)
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SessionConfig.ValidatingBuilder getAttachedBuilder() {
            r6 = this;
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r0 = new androidx.camera.core.impl.SessionConfig$ValidatingBuilder
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r2 = r6.mAttachedUseCasesToInfoMap
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r4 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r4
            boolean r5 = r4.getAttached()
            if (r5 == 0) goto L14
            androidx.camera.core.impl.SessionConfig r4 = r4.getSessionConfig()
            r0.add(r4)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            goto L14
        L3d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "All use case: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " for camera: "
            r2.append(r1)
            java.lang.String r1 = r6.mCameraId
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "UseCaseAttachState"
            androidx.camera.core.Logger.d(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Collection<androidx.camera.core.impl.SessionConfig> getAttachedSessionConfigs() {
            r1 = this;
            androidx.camera.core.impl.k0 r0 = new androidx.camera.core.impl.k0
            r0.<init>()
            java.util.Collection r0 = r1.getSessionConfigs(r0)
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> getAttachedUseCaseConfigs() {
            r1 = this;
            androidx.camera.core.impl.l0 r0 = new androidx.camera.core.impl.l0
            r0.<init>()
            java.util.Collection r0 = r1.getUseCaseConfigs(r0)
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public boolean isUseCaseAttached(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r1.mAttachedUseCasesToInfoMap
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r1.mAttachedUseCasesToInfoMap
            java.lang.Object r2 = r0.get(r2)
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r2 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r2
            boolean r2 = r2.getAttached()
            return r2
    }

    public void removeUseCase(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r1.mAttachedUseCasesToInfoMap
            r0.remove(r2)
            return
    }

    public void setUseCaseActive(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r2, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r3) {
            r0 = this;
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r1 = r0.getOrCreateUseCaseAttachInfo(r1, r2, r3)
            r2 = 1
            r1.setActive(r2)
            return
    }

    public void setUseCaseAttached(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r2, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r3) {
            r0 = this;
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r1 = r0.getOrCreateUseCaseAttachInfo(r1, r2, r3)
            r2 = 1
            r1.setAttached(r2)
            return
    }

    public void setUseCaseDetached(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r2.mAttachedUseCasesToInfoMap
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L9
            goto L20
        L9:
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r2.mAttachedUseCasesToInfoMap
            java.lang.Object r0 = r0.get(r3)
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r0 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r0
            r1 = 0
            r0.setAttached(r1)
            boolean r0 = r0.getActive()
            if (r0 != 0) goto L20
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r2.mAttachedUseCasesToInfoMap
            r0.remove(r3)
        L20:
            return
    }

    public void setUseCaseInactive(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r2.mAttachedUseCasesToInfoMap
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L9
            goto L20
        L9:
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r2.mAttachedUseCasesToInfoMap
            java.lang.Object r0 = r0.get(r3)
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r0 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r0
            r1 = 0
            r0.setActive(r1)
            boolean r0 = r0.getAttached()
            if (r0 != 0) goto L20
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r2.mAttachedUseCasesToInfoMap
            r0.remove(r3)
        L20:
            return
    }

    public void updateUseCase(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r4) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r0 = r1.mAttachedUseCasesToInfoMap
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L9
            return
        L9:
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r0 = new androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo
            r0.<init>(r3, r4)
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r3 = r1.mAttachedUseCasesToInfoMap
            java.lang.Object r3 = r3.get(r2)
            androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo r3 = (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo) r3
            boolean r4 = r3.getAttached()
            r0.setAttached(r4)
            boolean r3 = r3.getActive()
            r0.setActive(r3)
            java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo> r3 = r1.mAttachedUseCasesToInfoMap
            r3.put(r2, r0)
            return
    }
}
