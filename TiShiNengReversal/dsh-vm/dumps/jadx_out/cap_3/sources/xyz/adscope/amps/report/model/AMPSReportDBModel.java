package xyz.adscope.amps.report.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSReportDBModel {
    public java.lang.String eventCode;
    public java.lang.String eventId;
    public java.lang.String eventJsonStr;
    public long eventTime;

    public AMPSReportDBModel() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.eventCode = r0
            r3.eventId = r0
            r1 = 0
            r3.eventTime = r1
            r3.eventJsonStr = r0
            return
    }

    public java.lang.String getEventCode() {
            r1 = this;
            java.lang.String r0 = r1.eventCode
            return r0
    }

    public java.lang.String getEventId() {
            r1 = this;
            java.lang.String r0 = r1.eventId
            return r0
    }

    public java.lang.String getEventJsonStr() {
            r1 = this;
            java.lang.String r0 = r1.eventJsonStr
            return r0
    }

    public long getEventTime() {
            r2 = this;
            long r0 = r2.eventTime
            return r0
    }

    public void setEventCode(java.lang.String r1) {
            r0 = this;
            r0.eventCode = r1
            return
    }

    public void setEventId(java.lang.String r1) {
            r0 = this;
            r0.eventId = r1
            return
    }

    public void setEventJsonStr(java.lang.String r1) {
            r0 = this;
            r0.eventJsonStr = r1
            return
    }

    public void setEventTime(long r1) {
            r0 = this;
            r0.eventTime = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"eventCode\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventCode
            r0.append(r1)
            java.lang.String r1 = "\", \"eventId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventId
            r0.append(r1)
            java.lang.String r1 = "\", \"eventTime\":"
            r0.append(r1)
            long r1 = r3.eventTime
            r0.append(r1)
            java.lang.String r1 = ", \"eventJsonStr\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventJsonStr
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
