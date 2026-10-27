package com.umeng.analytics.filter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class EventList extends com.umeng.analytics.filter.c implements com.umeng.commonsdk.utils.FileLockCallback {
    private static final int DELETE_LIST_DATA = 2;
    private static final int LOAD_LIST_DATA = 1;
    private static final int SAVE_LIST_DATA = 0;
    private android.content.Context mAppContext;
    protected java.lang.String mEventList;
    protected java.lang.String mEventListKey;
    protected java.lang.String mEventListName;
    protected java.lang.String mEventListVersionKey;
    private com.umeng.commonsdk.utils.FileLockUtil mFileLock;

    public EventList(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.mEventListName = r1
            r0.mEventListKey = r1
            r0.mEventListVersionKey = r2
            com.umeng.commonsdk.utils.FileLockUtil r1 = new com.umeng.commonsdk.utils.FileLockUtil
            r1.<init>()
            r0.mFileLock = r1
            return
    }

    private void deleteDataFile(java.io.File r3) {
            r2 = this;
            android.content.Context r0 = r2.mAppContext
            if (r0 == 0) goto L17
            com.umeng.commonsdk.utils.FileLockUtil r0 = r2.mFileLock
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r3.delete()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
        L17:
            return
    }

    private boolean loadEventListFromFile(android.content.Context r9, java.io.File r10) {
            r8 = this;
            boolean r0 = r10.exists()
            r1 = 0
            if (r0 == 0) goto Lb1
            java.lang.String r0 = r8.mEventList
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb1
            r0 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L9b
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9b
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
        L1f:
            java.lang.String r2 = r10.readLine()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2c
            r0.append(r2)     // Catch: java.lang.Throwable -> L29
            goto L1f
        L29:
            r0 = move-exception
            goto L9f
        L2c:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L92
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.HelperUtils.getMD5(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r8.mEventListVersionKey     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = ""
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r9, r3, r4)     // Catch: java.lang.Throwable -> L29
            r8.mEventList = r0     // Catch: java.lang.Throwable -> L29
            r8.eventListChange()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r5.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = "--->>> loadEventListFromFile: mEventList = "
            r5.append(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = r8.mEventList     // Catch: java.lang.Throwable -> L29
            r5.append(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L29
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r5)     // Catch: java.lang.Throwable -> L29
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r9)     // Catch: java.lang.Throwable -> L29
            r5 = 1
            if (r4 == 0) goto L86
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L7a
            r8.mEventList = r0     // Catch: java.lang.Throwable -> L29
            r8.setMD5ClearFlag(r1)     // Catch: java.lang.Throwable -> L29
        L71:
            r10.close()     // Catch: java.lang.Throwable -> L75
            return r5
        L75:
            r10 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r10)
            return r5
        L7a:
            r8.setMD5ClearFlag(r5)     // Catch: java.lang.Throwable -> L29
        L7d:
            r10.close()     // Catch: java.lang.Throwable -> L81
            return r1
        L81:
            r10 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r10)
            return r1
        L86:
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L7d
            r8.mEventList = r0     // Catch: java.lang.Throwable -> L29
            r8.eventListChange()     // Catch: java.lang.Throwable -> L29
            goto L71
        L92:
            r10.close()     // Catch: java.lang.Throwable -> L96
            goto Lb1
        L96:
            r10 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r10)
            goto Lb1
        L9b:
            r10 = move-exception
            r7 = r0
            r0 = r10
            r10 = r7
        L9f:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r0)     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto Lb1
            goto L92
        La5:
            r0 = move-exception
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r10 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r10)
        Lb0:
            throw r0
        Lb1:
            return r1
    }

    private void saveEventListToFile(android.content.Context r2, java.io.File r3) {
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L12
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r1.mEventList     // Catch: java.lang.Throwable -> L12
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L12
            r0.write(r3)     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r3)
            return
    }

    public boolean enabled() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.mEventList     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto La
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = move-exception
            goto Ld
        La:
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    protected void eventListChange() {
            r0 = this;
            return
    }

    public boolean matchHit(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(java.io.File r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 != 0) goto Le
            monitor-enter(r2)
            android.content.Context r4 = r2.mAppContext     // Catch: java.lang.Throwable -> Lb
            r2.saveEventListToFile(r4, r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            goto L3d
        Lb:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
        Le:
            if (r4 != r0) goto L2e
            monitor-enter(r2)
            android.content.Context r4 = r2.mAppContext     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.loadEventListFromFile(r4, r3)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> find event list data file, load it."
            com.umeng.commonsdk.debug.UMRTLog.i(r3, r4)     // Catch: java.lang.Throwable -> L21
            goto L2a
        L21:
            r3 = move-exception
            goto L2c
        L23:
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> can't find event list file."
            com.umeng.commonsdk.debug.UMRTLog.i(r3, r4)     // Catch: java.lang.Throwable -> L21
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            goto L3d
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
        L2e:
            r1 = 2
            if (r4 != r1) goto L3d
            monitor-enter(r2)
            r4 = 0
            r2.mEventList = r4     // Catch: java.lang.Throwable -> L3a
            r2.deleteDataFile(r3)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            throw r3
        L3d:
            return r0
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.umeng.analytics.filter.c, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "ekv_bl_ver"
            boolean r0 = r0.equals(r6)
            r1 = 2
            java.lang.String r2 = "MobclickRT"
            if (r0 == 0) goto L24
            if (r7 != 0) goto L24
            java.lang.String r0 = "--->>> disable black list for ekv."
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)
            java.io.File r0 = new java.io.File
            android.content.Context r3 = r5.mAppContext
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r4 = r5.mEventListName
            r0.<init>(r3, r4)
            com.umeng.commonsdk.utils.FileLockUtil r3 = r5.mFileLock
            r3.doFileOperateion(r0, r5, r1)
        L24:
            java.lang.String r0 = "ekv_wl_ver"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L45
            if (r7 != 0) goto L45
            java.lang.String r6 = "--->>> disable white list for ekv."
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r6)
            java.io.File r6 = new java.io.File
            android.content.Context r7 = r5.mAppContext
            java.io.File r7 = r7.getFilesDir()
            java.lang.String r0 = r5.mEventListName
            r6.<init>(r7, r0)
            com.umeng.commonsdk.utils.FileLockUtil r7 = r5.mFileLock
            r7.doFileOperateion(r6, r5, r1)
        L45:
            return
    }

    @Override // com.umeng.analytics.filter.c, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
    public boolean onPreProcessImprintKey(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L71
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L71
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "--->>> onPreProcessImprintKey: key = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "; len of value="
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "--->>> onPreProcessImprintKey: value = "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r4)
            r3.mEventList = r5
            r3.eventListChange()
            java.io.File r4 = new java.io.File
            android.content.Context r5 = r3.mAppContext
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r0 = r3.mEventListName
            r4.<init>(r5, r0)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L68
            r4.createNewFile()     // Catch: java.io.IOException -> L5e
            goto L68
        L5e:
            r4.createNewFile()     // Catch: java.io.IOException -> L62
            goto L68
        L62:
            r5 = move-exception
            android.content.Context r0 = r3.mAppContext
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r5)
        L68:
            com.umeng.commonsdk.utils.FileLockUtil r5 = r3.mFileLock
            r0 = 0
            r5.doFileOperateion(r4, r3, r0)
            r3.setMD5ClearFlag(r0)
        L71:
            r4 = 1
            return r4
    }

    public void register(android.content.Context r4) {
            r3 = this;
            android.content.Context r0 = r3.mAppContext
            if (r0 != 0) goto Le
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.mAppContext = r4
        Le:
            java.io.File r4 = new java.io.File
            android.content.Context r0 = r3.mAppContext
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r1 = r3.mEventListName
            r4.<init>(r0, r1)
            android.content.Context r0 = r3.mAppContext
            java.lang.String r1 = r3.mEventListVersionKey
            java.lang.String r2 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3b
            boolean r0 = r4.exists()
            r1 = 1
            if (r0 == 0) goto L38
            com.umeng.commonsdk.utils.FileLockUtil r0 = r3.mFileLock
            r0.doFileOperateion(r4, r3, r1)
            goto L3b
        L38:
            r3.setMD5ClearFlag(r1)
        L3b:
            android.content.Context r4 = r3.mAppContext
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)
            if (r4 == 0) goto L59
            android.content.Context r4 = r3.mAppContext
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r4)
            java.lang.String r0 = r3.mEventListKey
            r4.registPreProcessCallback(r0, r3)
            android.content.Context r4 = r3.mAppContext
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r4)
            java.lang.String r0 = r3.mEventListVersionKey
            r4.registImprintCallback(r0, r3)
        L59:
            return
    }

    public void setMD5ClearFlag(boolean r1) {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.mEventListName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La0
            java.lang.String r0 = r4.mEventListKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "EventListName:"
            r1.append(r2)
            java.lang.String r2 = r4.mEventListName
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "listKey:"
            r1.append(r3)
            java.lang.String r3 = r4.mEventListKey
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = r4.mEventList
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "listKeyValue:"
            r1.append(r3)
            java.lang.String r3 = r4.mEventList
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L74
        L6f:
            java.lang.String r1 = "listKeyValue:empty,"
            r0.append(r1)
        L74:
            java.lang.String r1 = r4.mEventListVersionKey
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "listKeyVer:"
            r1.append(r3)
            java.lang.String r3 = r4.mEventListVersionKey
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L9b
        L96:
            java.lang.String r1 = "listKeyVer:empty]"
            r0.append(r1)
        L9b:
            java.lang.String r0 = r0.toString()
            return r0
        La0:
            java.lang.String r0 = "Uninitialized EventList."
            return r0
    }
}
