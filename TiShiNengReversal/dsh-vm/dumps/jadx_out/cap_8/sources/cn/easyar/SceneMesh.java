package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C23E6D4A2")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SceneMesh extends cn.easyar.RefBase {
    protected SceneMesh(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("C669D0A23")
    public native float getBlockDimensionInMeters();

    @cn.easyar.MethodId("C7EB70090")
    public native java.util.ArrayList<cn.easyar.e> getBlocksInfoIncremental();

    @cn.easyar.MethodId("CCE57B7BF")
    public native cn.easyar.Buffer getIndicesAll();

    @cn.easyar.MethodId("C5C5A3A2D")
    public native cn.easyar.Buffer getIndicesIncremental();

    @cn.easyar.MethodId("CD25D6612")
    public native cn.easyar.Buffer getNormalsAll();

    @cn.easyar.MethodId("CBE8FE899")
    public native cn.easyar.Buffer getNormalsIncremental();

    @cn.easyar.MethodId("CD19BCB1A")
    public native int getNumOfIndexAll();

    @cn.easyar.MethodId("C9DC23414")
    public native int getNumOfIndexIncremental();

    @cn.easyar.MethodId("C8BE49803")
    public native int getNumOfVertexAll();

    @cn.easyar.MethodId("C353E70AB")
    public native int getNumOfVertexIncremental();

    @cn.easyar.MethodId("CA18994F8")
    public native cn.easyar.Buffer getVerticesAll();

    @cn.easyar.MethodId("CEA32E330")
    public native cn.easyar.Buffer getVerticesIncremental();
}
