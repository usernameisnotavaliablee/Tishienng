package xyz.adscope.amps.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSFrequencyManager {
    static final java.lang.String KEY_TABLE_NAME = "amps_frequency_event_table";
    private static xyz.adscope.amps.manager.AMPSFrequencyManager instance;
    private static java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> mAdSourceFrequencyData;
    private static java.util.Comparator<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel> mComparator;
    private static java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> mMediationFrequencyData;
    private xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager mAmpsDataBaseManager;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xyz.adscope.amps.manager.AMPSFrequencyManager.mAdSourceFrequencyData = r0
            xyz.adscope.amps.manager.AMPSFrequencyManager$1 r0 = new xyz.adscope.amps.manager.AMPSFrequencyManager$1
            r0.<init>()
            xyz.adscope.amps.manager.AMPSFrequencyManager.mComparator = r0
            return
    }

    public AMPSFrequencyManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized xyz.adscope.amps.manager.AMPSFrequencyManager getInstance() {
            java.lang.Class<xyz.adscope.amps.manager.AMPSFrequencyManager> r0 = xyz.adscope.amps.manager.AMPSFrequencyManager.class
            monitor-enter(r0)
            xyz.adscope.amps.manager.AMPSFrequencyManager r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.manager.AMPSFrequencyManager> r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.manager.AMPSFrequencyManager r2 = new xyz.adscope.amps.manager.AMPSFrequencyManager     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.manager.AMPSFrequencyManager.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.manager.AMPSFrequencyManager r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void putAdsourceFrequencyData(xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L3a
        L3:
            java.lang.String r0 = r4.getAdSourceSpaceId()     // Catch: java.lang.Exception -> L3a
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto Le
            goto L3a
        Le:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.mAdSourceFrequencyData     // Catch: java.lang.Exception -> L3a
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L1f
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.mAdSourceFrequencyData     // Catch: java.lang.Exception -> L3a
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L3a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L3a
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L28
            int r2 = r1.size()     // Catch: java.lang.Exception -> L3a
            if (r2 != 0) goto L2d
        L28:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
        L2d:
            r1.add(r4)     // Catch: java.lang.Exception -> L3a
            java.util.Comparator<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mComparator     // Catch: java.lang.Exception -> L3a
            java.util.Collections.sort(r1, r4)     // Catch: java.lang.Exception -> L3a
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mAdSourceFrequencyData     // Catch: java.lang.Exception -> L3a
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L3a
        L3a:
            return
    }

    private void putFrequencyData(java.lang.String r1, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel> r2) {
            r0 = this;
            if (r2 == 0) goto L20
            int r1 = r2.size()     // Catch: java.lang.Exception -> L20
            if (r1 != 0) goto L9
            goto L20
        L9:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Exception -> L20
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L20
            xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r2 = (xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel) r2     // Catch: java.lang.Exception -> L20
            r0.putMediationFrequencyData(r2)     // Catch: java.lang.Exception -> L20
            r0.putAdsourceFrequencyData(r2)     // Catch: java.lang.Exception -> L20
            goto Ld
        L20:
            return
    }

    private void putMediationFrequencyData(xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L3a
        L3:
            java.lang.String r0 = r4.getMediationSpaceId()     // Catch: java.lang.Exception -> L3a
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto Le
            goto L3a
        Le:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData     // Catch: java.lang.Exception -> L3a
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L1f
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r1 = xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData     // Catch: java.lang.Exception -> L3a
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L3a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L3a
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L28
            int r2 = r1.size()     // Catch: java.lang.Exception -> L3a
            if (r2 != 0) goto L2d
        L28:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
        L2d:
            r1.add(r4)     // Catch: java.lang.Exception -> L3a
            java.util.Comparator<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mComparator     // Catch: java.lang.Exception -> L3a
            java.util.Collections.sort(r1, r4)     // Catch: java.lang.Exception -> L3a
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData     // Catch: java.lang.Exception -> L3a
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L3a
        L3a:
            return
    }

    public void initFrequencyData(java.lang.String r4) {
            r3 = this;
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r3.mAmpsDataBaseManager     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L13
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = new xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager     // Catch: java.lang.Throwable -> L63
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Throwable -> L63
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L63
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r3.mAmpsDataBaseManager = r0     // Catch: java.lang.Throwable -> L63
        L13:
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r3.mAmpsDataBaseManager     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r1.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "amps_frequency_event_table_"
            r1.append(r2)     // Catch: java.lang.Throwable -> L63
            r1.append(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.Class<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel> r2 = xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel.class
            r0.setTableNameAndModel(r1, r2)     // Catch: java.lang.Throwable -> L63
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r0 = xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L34
            goto L63
        L34:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L63
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r3.mAmpsDataBaseManager     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L3c
            goto L63
        L3c:
            xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r0 = new xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r1 = 2
            long r1 = xyz.adscope.amps.tool.util.AMPSDateUtil.getTimeMillisBeforeDay(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L63
            r0.setEventTime(r1)     // Catch: java.lang.Throwable -> L63
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r1 = r3.mAmpsDataBaseManager     // Catch: java.lang.Throwable -> L63
            r1.deleteOutTime(r0)     // Catch: java.lang.Throwable -> L63
            xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r0 = new xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r0.setMediationSpaceId(r4)     // Catch: java.lang.Throwable -> L63
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r1 = r3.mAmpsDataBaseManager     // Catch: java.lang.Throwable -> L63
            java.util.List r0 = r1.query(r0)     // Catch: java.lang.Throwable -> L63
            r3.putFrequencyData(r4, r0)     // Catch: java.lang.Throwable -> L63
        L63:
            return
    }

    public boolean isPassAdSourceFrequencyLimit(java.lang.String r11, xyz.adscope.amps.model.config.response.FrequencyModel r12) {
            r10 = this;
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> Lc6
            if (r1 != 0) goto Lc6
            if (r12 != 0) goto Lb
            goto Lc6
        Lb:
            long r1 = r12.getTime()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r3 = r12.getEvent()     // Catch: java.lang.Exception -> Lc6
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto Lc6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lc6
            if (r4 == 0) goto L21
            goto Lc6
        L21:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mAdSourceFrequencyData     // Catch: java.lang.Exception -> Lc6
            boolean r4 = r4.containsKey(r11)     // Catch: java.lang.Exception -> Lc6
            if (r4 != 0) goto L2a
            return r0
        L2a:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mAdSourceFrequencyData     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r4 = r4.get(r11)     // Catch: java.lang.Exception -> Lc6
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Exception -> Lc6
            if (r4 == 0) goto Lc6
            int r5 = r4.size()     // Catch: java.lang.Exception -> Lc6
            if (r5 != 0) goto L3c
            goto Lc6
        L3c:
            int r12 = r12.getCount()     // Catch: java.lang.Exception -> Lc6
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lc6
            long r5 = r5 - r1
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> Lc6
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Exception -> Lc6
            r4 = 0
            r5 = 0
        L4f:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Exception -> Lc6
            if (r6 == 0) goto Lc6
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Exception -> Lc6
            xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r6 = (xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel) r6     // Catch: java.lang.Exception -> Lc6
            if (r6 == 0) goto L4f
            java.lang.String r7 = r6.getEventCode()     // Catch: java.lang.Exception -> Lc6
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> Lc6
            if (r7 != 0) goto L4f
            java.lang.String r7 = r6.getEventTime()     // Catch: java.lang.Exception -> Lc6
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> Lc6
            if (r7 == 0) goto L72
            goto L4f
        L72:
            java.lang.String r7 = r6.getEventCode()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r6 = r6.getEventTime()     // Catch: java.lang.Exception -> Lc6
            boolean r7 = r3.equalsIgnoreCase(r7)     // Catch: java.lang.Exception -> Lc6
            if (r7 != 0) goto L81
            goto L4f
        L81:
            int r7 = r6.compareTo(r1)     // Catch: java.lang.Exception -> Lc6
            if (r7 <= 0) goto L89
            int r5 = r5 + 1
        L89:
            java.lang.String r7 = "amps_log_tag"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r8.<init>()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = "filter isPassAdSourceFrequencyLimit tempFrequencyCount:"
            r8.append(r9)     // Catch: java.lang.Exception -> Lc6
            r8.append(r5)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = ";eventCode:"
            r8.append(r9)     // Catch: java.lang.Exception -> Lc6
            r8.append(r3)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = ";spaceId:"
            r8.append(r9)     // Catch: java.lang.Exception -> Lc6
            r8.append(r11)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = ";eventTime:"
            r8.append(r9)     // Catch: java.lang.Exception -> Lc6
            r8.append(r6)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = ";compareTo:"
            r8.append(r9)     // Catch: java.lang.Exception -> Lc6
            int r6 = r6.compareTo(r1)     // Catch: java.lang.Exception -> Lc6
            r8.append(r6)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> Lc6
            xyz.adscope.common.tool.LogUtil.d(r7, r6)     // Catch: java.lang.Exception -> Lc6
            if (r5 < r12) goto L4f
            return r4
        Lc6:
            return r0
    }

    public boolean isPassMediationFrequencyLimit(java.lang.String r10, xyz.adscope.amps.model.config.response.FrequencyModel r11) {
            r9 = this;
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> La4
            if (r1 != 0) goto La4
            if (r11 != 0) goto Lb
            goto La4
        Lb:
            long r1 = r11.getTime()     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = r11.getEvent()     // Catch: java.lang.Exception -> La4
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto La4
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto L21
            goto La4
        L21:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData     // Catch: java.lang.Exception -> La4
            boolean r4 = r4.containsKey(r10)     // Catch: java.lang.Exception -> La4
            if (r4 != 0) goto L2a
            return r0
        L2a:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel>> r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.mMediationFrequencyData     // Catch: java.lang.Exception -> La4
            java.lang.Object r10 = r4.get(r10)     // Catch: java.lang.Exception -> La4
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> La4
            if (r10 == 0) goto La4
            int r4 = r10.size()     // Catch: java.lang.Exception -> La4
            if (r4 != 0) goto L3b
            goto La4
        L3b:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La4
            long r4 = r4 - r1
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> La4
            int r11 = r11.getCount()     // Catch: java.lang.Exception -> La4
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> La4
            r2 = 0
            r4 = 0
        L4e:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto La4
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Exception -> La4
            xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r5 = (xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel) r5     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L4e
            java.lang.String r6 = r5.getEventCode()     // Catch: java.lang.Exception -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> La4
            if (r6 != 0) goto L4e
            java.lang.String r6 = r5.getEventTime()     // Catch: java.lang.Exception -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> La4
            if (r6 == 0) goto L71
            goto L4e
        L71:
            java.lang.String r6 = r5.getEventCode()     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = r5.getEventTime()     // Catch: java.lang.Exception -> La4
            boolean r8 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> La4
            if (r8 != 0) goto L80
            goto L4e
        L80:
            java.lang.String r8 = "request"
            boolean r8 = r8.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> La4
            if (r8 == 0) goto L93
            java.lang.String r5 = r5.getAdSourceSpaceId()     // Catch: java.lang.Exception -> La4
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> La4
            if (r5 != 0) goto L93
            goto L4e
        L93:
            boolean r5 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto La1
            int r5 = r7.compareTo(r1)     // Catch: java.lang.Exception -> La4
            if (r5 <= 0) goto La1
            int r4 = r4 + 1
        La1:
            if (r4 < r11) goto L4e
            return r2
        La4:
            return r0
    }

    public void putFrequencyData(xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L10
        L3:
            r1.putMediationFrequencyData(r2)     // Catch: java.lang.Exception -> L10
            r1.putAdsourceFrequencyData(r2)     // Catch: java.lang.Exception -> L10
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r1.mAmpsDataBaseManager     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L10
            r0.insert(r2)     // Catch: java.lang.Exception -> L10
        L10:
            return
    }
}
