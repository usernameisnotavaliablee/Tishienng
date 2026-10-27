package com.bytedance.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String a(android.app.ActivityManager.ProcessErrorStateInfo r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "|------------- processErrorStateInfo--------------|\n"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "condition: "
            r1.<init>(r2)
            int r2 = r4.condition
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "processName: "
            r1.<init>(r3)
            java.lang.String r3 = r4.processName
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "pid: "
            r1.<init>(r3)
            int r3 = r4.pid
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "uid: "
            r1.<init>(r3)
            int r3 = r4.uid
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "tag: "
            r1.<init>(r3)
            java.lang.String r3 = r4.tag
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "shortMsg : "
            r1.<init>(r3)
            java.lang.String r3 = r4.shortMsg
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "longMsg : "
            r1.<init>(r3)
            java.lang.String r4 = r4.longMsg
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            r0.append(r4)
            java.lang.String r4 = "-----------------------end----------------------------"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
