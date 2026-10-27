package xyz.adscope.amps.report.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IReportInterface {
    void deleteLog(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r1);

    void reportAdLog(xyz.adscope.amps.model.AMPSCycleModel r1, java.lang.String r2);

    void reportInitLog(java.lang.String r1, java.lang.String r2);

    void saveLog(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r1);

    void uploadLog(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r1);
}
