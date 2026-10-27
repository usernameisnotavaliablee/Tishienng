package androidx.profileinstaller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class DexProfileData {

    @androidx.annotation.NonNull
    final java.lang.String apkName;
    int classSetSize;

    @androidx.annotation.NonNull
    int[] classes;
    final long dexChecksum;

    @androidx.annotation.NonNull
    final java.lang.String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;

    @androidx.annotation.NonNull
    final java.util.TreeMap<java.lang.Integer, java.lang.Integer> methods;
    final int numMethodIds;

    DexProfileData(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, long r3, long r5, int r7, int r8, int r9, @androidx.annotation.NonNull int[] r10, @androidx.annotation.NonNull java.util.TreeMap<java.lang.Integer, java.lang.Integer> r11) {
            r0 = this;
            r0.<init>()
            r0.apkName = r1
            r0.dexName = r2
            r0.dexChecksum = r3
            r0.mTypeIdCount = r5
            r0.classSetSize = r7
            r0.hotMethodRegionSize = r8
            r0.numMethodIds = r9
            r0.classes = r10
            r0.methods = r11
            return
    }
}
