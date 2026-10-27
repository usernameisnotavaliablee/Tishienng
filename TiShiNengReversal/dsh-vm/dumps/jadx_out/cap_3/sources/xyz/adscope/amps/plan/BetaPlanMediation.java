package xyz.adscope.amps.plan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BetaPlanMediation {
    private static xyz.adscope.amps.plan.BetaPlanMediation instance;
    private java.lang.String hapAppPlanId;
    private boolean isExecuteBetaPlan;
    private boolean isExecuteHapAppBetaPlan;
    private boolean isHaveJudgeBetaPlan;
    private boolean isHaveJudgeHapAppBetaPlan;
    private java.lang.String logPlanId;

    public BetaPlanMediation() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "aa2623c4a099eaa875162146c8a9e483"
            r1.logPlanId = r0
            java.lang.String r0 = "c0447125b1a93ba9aa0b3399bcc902ce"
            r1.hapAppPlanId = r0
            return
    }

    public static synchronized xyz.adscope.amps.plan.BetaPlanMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.plan.BetaPlanMediation> r0 = xyz.adscope.amps.plan.BetaPlanMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.plan.BetaPlanMediation r1 = xyz.adscope.amps.plan.BetaPlanMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.plan.BetaPlanMediation> r1 = xyz.adscope.amps.plan.BetaPlanMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.plan.BetaPlanMediation r2 = new xyz.adscope.amps.plan.BetaPlanMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.plan.BetaPlanMediation.instance = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            xyz.adscope.amps.plan.BetaPlanMediation r1 = xyz.adscope.amps.plan.BetaPlanMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public boolean isExecuteBetaPlan() {
            r13 = this;
            boolean r0 = r13.isHaveJudgeBetaPlan
            if (r0 == 0) goto L7
            boolean r0 = r13.isExecuteBetaPlan
            return r0
        L7:
            r0 = 1
            r13.isHaveJudgeBetaPlan = r0
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.inter.IAMPSInitInterface r1 = r1.getIAMPSInitInterface()
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r1.getGlobalModel()
            r2 = 0
            if (r1 != 0) goto L1a
            return r2
        L1a:
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()
            if (r1 != 0) goto L21
            return r2
        L21:
            xyz.adscope.amps.model.config.response.TestPlanModel r1 = r1.getTestPlan()
            if (r1 != 0) goto L28
            return r2
        L28:
            java.lang.String r3 = r13.logPlanId
            java.lang.String r4 = r1.getPlanId()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L35
            return r2
        L35:
            java.lang.String r3 = r1.getRandom()     // Catch: java.lang.Exception -> Lae
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> Lae
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r3)     // Catch: java.lang.Exception -> Lae
            if (r3 != 0) goto L44
            return r2
        L44:
            java.lang.String r3 = r1.getStartTime()     // Catch: java.lang.Exception -> Lae
            java.lang.String r4 = r1.getEndTime()     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = r1.getDuration()     // Catch: java.lang.Exception -> Lae
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lae
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lae
            java.lang.String r8 = "0"
            r9 = 0
            if (r7 != 0) goto L69
            boolean r7 = r8.equals(r3)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L69
            long r11 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Exception -> Lae
            goto L6a
        L69:
            r11 = r9
        L6a:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lae
            if (r3 != 0) goto L7b
            boolean r3 = r8.equals(r4)     // Catch: java.lang.Exception -> Lae
            if (r3 != 0) goto L7b
            long r3 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> Lae
            goto L7c
        L7b:
            r3 = r9
        L7c:
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L8d
            boolean r7 = r8.equals(r1)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L8d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Lae
            goto L8e
        L8d:
            r1 = 0
        L8e:
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto La1
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 <= 0) goto La1
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto La1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto La1
            r13.isExecuteBetaPlan = r0     // Catch: java.lang.Exception -> Lae
            return r0
        La1:
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 < 0) goto Lae
            long r3 = (long) r1     // Catch: java.lang.Exception -> Lae
            long r11 = r11 + r3
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 > 0) goto Lae
            r13.isExecuteBetaPlan = r0     // Catch: java.lang.Exception -> Lae
            return r0
        Lae:
            return r2
    }

    public boolean isExecuteHapBetaPlan() {
            r13 = this;
            boolean r0 = r13.isHaveJudgeHapAppBetaPlan
            if (r0 == 0) goto L7
            boolean r0 = r13.isExecuteHapAppBetaPlan
            return r0
        L7:
            r0 = 1
            r13.isHaveJudgeHapAppBetaPlan = r0
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.inter.IAMPSInitInterface r1 = r1.getIAMPSInitInterface()
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r1.getGlobalModel()
            r2 = 0
            if (r1 != 0) goto L1a
            return r2
        L1a:
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()
            if (r1 != 0) goto L21
            return r2
        L21:
            xyz.adscope.amps.model.config.response.TestPlanModel r1 = r1.getTestPlan()
            if (r1 != 0) goto L28
            return r2
        L28:
            java.lang.String r3 = r13.hapAppPlanId
            java.lang.String r4 = r1.getPlanId()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L35
            return r2
        L35:
            java.lang.String r3 = r1.getRandom()     // Catch: java.lang.Exception -> Lae
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> Lae
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r3)     // Catch: java.lang.Exception -> Lae
            if (r3 != 0) goto L44
            return r2
        L44:
            java.lang.String r3 = r1.getStartTime()     // Catch: java.lang.Exception -> Lae
            java.lang.String r4 = r1.getEndTime()     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = r1.getDuration()     // Catch: java.lang.Exception -> Lae
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lae
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lae
            java.lang.String r8 = "0"
            r9 = 0
            if (r7 != 0) goto L69
            boolean r7 = r8.equals(r3)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L69
            long r11 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Exception -> Lae
            goto L6a
        L69:
            r11 = r9
        L6a:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lae
            if (r3 != 0) goto L7b
            boolean r3 = r8.equals(r4)     // Catch: java.lang.Exception -> Lae
            if (r3 != 0) goto L7b
            long r3 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> Lae
            goto L7c
        L7b:
            r3 = r9
        L7c:
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L8d
            boolean r7 = r8.equals(r1)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L8d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Lae
            goto L8e
        L8d:
            r1 = 0
        L8e:
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto La1
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 <= 0) goto La1
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto La1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto La1
            r13.isExecuteHapAppBetaPlan = r0     // Catch: java.lang.Exception -> Lae
            return r0
        La1:
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 < 0) goto Lae
            long r3 = (long) r1     // Catch: java.lang.Exception -> Lae
            long r11 = r11 + r3
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 > 0) goto Lae
            r13.isExecuteHapAppBetaPlan = r0     // Catch: java.lang.Exception -> Lae
            return r0
        Lae:
            return r2
    }
}
