package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSConfigResponseModel extends xyz.adscope.amps.model.AMPSBaseModel {
    private xyz.adscope.amps.model.config.response.BlackRuleModel blackRule;
    private xyz.adscope.amps.model.config.response.ConfigModel config;
    private java.lang.String customData;
    private xyz.adscope.amps.model.config.response.EventModel event;
    private long lastUpdateTime;
    private xyz.adscope.amps.model.config.response.LogStrategyModel logStrategy;
    private xyz.adscope.amps.model.config.response.MaterialManagerModel materialManager;
    private xyz.adscope.amps.model.config.response.MediationModel mediation;
    private xyz.adscope.amps.model.config.response.TestPlanModel testPlan;
    private java.lang.String version;

    public AMPSConfigResponseModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.customData = r0
            return
    }

    public xyz.adscope.amps.model.config.response.BlackRuleModel getBlackRule() {
            r1 = this;
            xyz.adscope.amps.model.config.response.BlackRuleModel r0 = r1.blackRule
            return r0
    }

    public xyz.adscope.amps.model.config.response.ConfigModel getConfig() {
            r1 = this;
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r1.config
            return r0
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public xyz.adscope.amps.model.config.response.EventModel getEvent() {
            r1 = this;
            xyz.adscope.amps.model.config.response.EventModel r0 = r1.event
            return r0
    }

    public long getLastUpdateTime() {
            r2 = this;
            long r0 = r2.lastUpdateTime
            return r0
    }

    public xyz.adscope.amps.model.config.response.LogStrategyModel getLogStrategy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.LogStrategyModel r0 = r1.logStrategy
            return r0
    }

    public xyz.adscope.amps.model.config.response.MaterialManagerModel getMaterialManager() {
            r1 = this;
            xyz.adscope.amps.model.config.response.MaterialManagerModel r0 = r1.materialManager
            return r0
    }

    public xyz.adscope.amps.model.config.response.MediationModel getMediation() {
            r1 = this;
            xyz.adscope.amps.model.config.response.MediationModel r0 = r1.mediation
            return r0
    }

    public xyz.adscope.amps.model.config.response.TestPlanModel getTestPlan() {
            r1 = this;
            xyz.adscope.amps.model.config.response.TestPlanModel r0 = r1.testPlan
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setBlackRule(xyz.adscope.amps.model.config.response.BlackRuleModel r1) {
            r0 = this;
            r0.blackRule = r1
            return
    }

    public void setConfig(xyz.adscope.amps.model.config.response.ConfigModel r1) {
            r0 = this;
            r0.config = r1
            return
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setEvent(xyz.adscope.amps.model.config.response.EventModel r1) {
            r0 = this;
            r0.event = r1
            return
    }

    public void setLastUpdateTime(long r1) {
            r0 = this;
            r0.lastUpdateTime = r1
            return
    }

    public void setLogStrategy(xyz.adscope.amps.model.config.response.LogStrategyModel r1) {
            r0 = this;
            r0.logStrategy = r1
            return
    }

    public void setMaterialManager(xyz.adscope.amps.model.config.response.MaterialManagerModel r1) {
            r0 = this;
            r0.materialManager = r1
            return
    }

    public void setMediation(xyz.adscope.amps.model.config.response.MediationModel r1) {
            r0 = this;
            r0.mediation = r1
            return
    }

    public void setTestPlan(xyz.adscope.amps.model.config.response.TestPlanModel r1) {
            r0 = this;
            r0.testPlan = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"mediation\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.MediationModel r1 = r3.mediation
            r0.append(r1)
            java.lang.String r1 = ", \"event\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.EventModel r1 = r3.event
            r0.append(r1)
            java.lang.String r1 = ", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.customData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\", \"config\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.ConfigModel r1 = r3.config
            r0.append(r1)
            java.lang.String r1 = ", \"logStrategy\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.LogStrategyModel r1 = r3.logStrategy
            r0.append(r1)
            java.lang.String r1 = ", \"testPlan\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.TestPlanModel r1 = r3.testPlan
            r0.append(r1)
            java.lang.String r1 = ", \"lastUpdateTime\":"
            r0.append(r1)
            long r1 = r3.lastUpdateTime
            r0.append(r1)
            java.lang.String r1 = ", \"blackRule\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.BlackRuleModel r1 = r3.blackRule
            r0.append(r1)
            java.lang.String r1 = ", \"materialManager\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.MaterialManagerModel r1 = r3.materialManager
            r0.append(r1)
            java.lang.String r1 = ", \"version\":\""
            r0.append(r1)
            java.lang.String r1 = r3.version
            r0.append(r1)
            java.lang.String r1 = "\"} "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
