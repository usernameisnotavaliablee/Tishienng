package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SurfaceCombination {
    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> mSurfaceConfigList;

    public SurfaceCombination() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mSurfaceConfigList = r0
            return
    }

    private static void generateArrangements(java.util.List<int[]> r4, int r5, int[] r6, int r7) {
            int r0 = r6.length
            if (r7 < r0) goto Ld
            java.lang.Object r5 = r6.clone()
            int[] r5 = (int[]) r5
            r4.add(r5)
            return
        Ld:
            r0 = 0
            r1 = 0
        Lf:
            if (r1 >= r5) goto L26
            r2 = 0
        L12:
            if (r2 >= r7) goto L1c
            r3 = r6[r2]
            if (r1 != r3) goto L19
            goto L23
        L19:
            int r2 = r2 + 1
            goto L12
        L1c:
            r6[r7] = r1
            int r2 = r7 + 1
            generateArrangements(r4, r5, r6, r2)
        L23:
            int r1 = r1 + 1
            goto Lf
        L26:
            return
    }

    private java.util.List<int[]> getElementsArrangements(int r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int[] r1 = new int[r4]
            r2 = 0
            generateArrangements(r0, r4, r1, r2)
            return r0
    }

    public boolean addSurfaceConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig r2) {
            r1 = this;
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r0 = r1.mSurfaceConfigList
            boolean r2 = r0.add(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getOrderedSupportedSurfaceConfigList(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SurfaceConfig> r10) {
            r9 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            return r10
        Lc:
            int r0 = r10.size()
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r1 = r9.mSurfaceConfigList
            int r1 = r1.size()
            r2 = 0
            if (r0 == r1) goto L1a
            return r2
        L1a:
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r0 = r9.mSurfaceConfigList
            int r0 = r0.size()
            java.util.List r0 = r9.getElementsArrangements(r0)
            int r1 = r10.size()
            androidx.camera.core.impl.SurfaceConfig[] r1 = new androidx.camera.core.impl.SurfaceConfig[r1]
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L77
            java.lang.Object r3 = r0.next()
            int[] r3 = (int[]) r3
            r5 = 1
            r6 = 1
        L3d:
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r7 = r9.mSurfaceConfigList
            int r7 = r7.size()
            if (r4 >= r7) goto L74
            r7 = r3[r4]
            int r8 = r10.size()
            if (r7 >= r8) goto L71
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r7 = r9.mSurfaceConfigList
            java.lang.Object r7 = r7.get(r4)
            androidx.camera.core.impl.SurfaceConfig r7 = (androidx.camera.core.impl.SurfaceConfig) r7
            r8 = r3[r4]
            java.lang.Object r8 = r10.get(r8)
            androidx.camera.core.impl.SurfaceConfig r8 = (androidx.camera.core.impl.SurfaceConfig) r8
            boolean r7 = r7.isSupported(r8)
            r6 = r6 & r7
            if (r6 != 0) goto L65
            goto L74
        L65:
            r7 = r3[r4]
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r8 = r9.mSurfaceConfigList
            java.lang.Object r8 = r8.get(r4)
            androidx.camera.core.impl.SurfaceConfig r8 = (androidx.camera.core.impl.SurfaceConfig) r8
            r1[r7] = r8
        L71:
            int r4 = r4 + 1
            goto L3d
        L74:
            if (r6 == 0) goto L2e
            r4 = 1
        L77:
            if (r4 == 0) goto L7e
            java.util.List r10 = java.util.Arrays.asList(r1)
            return r10
        L7e:
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getSurfaceConfigList() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r0 = r1.mSurfaceConfigList
            return r0
    }

    public boolean removeSurfaceConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig r2) {
            r1 = this;
            java.util.List<androidx.camera.core.impl.SurfaceConfig> r0 = r1.mSurfaceConfigList
            boolean r2 = r0.remove(r2)
            return r2
    }
}
