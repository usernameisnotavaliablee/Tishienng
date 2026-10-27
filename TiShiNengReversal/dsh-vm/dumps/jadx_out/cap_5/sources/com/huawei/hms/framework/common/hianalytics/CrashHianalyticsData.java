package com.huawei.hms.framework.common.hianalytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CrashHianalyticsData extends com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData {
    public static final java.lang.String CRASH_TYPE = "crash_type";
    public static final java.lang.String EVENT_ID_CRASH = "crash";
    public static final java.lang.String EXCEPTION_NAME = "exception_name";
    public static final java.lang.String MESSAGE = "message";
    public static final java.lang.String PROCESS_ID = "process_id";
    public static final java.lang.String STACK_TRACE = "stack_trace";
    public static final java.lang.String THREAD_ID = "thread_id";
    public static final java.lang.String THREAD_NAME = "thread_name";
    public static final java.lang.String TIME = "time";

    public CrashHianalyticsData() {
            r4 = this;
            r4.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "time"
            r4.put(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            int r2 = android.os.Process.myPid()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "process_id"
            r4.put(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            int r1 = android.os.Process.myTid()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "thread_id"
            r4.put(r1, r0)
            return
    }
}
