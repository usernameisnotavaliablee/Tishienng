package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CustomMessage {
    public java.lang.String appId;
    public java.lang.String contentType;
    public java.lang.String extra;
    public java.lang.String message;
    public java.lang.String messageId;
    public byte platform;
    public java.lang.String senderId;
    public java.lang.String title;

    public CustomMessage() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CustomMessage{messageId='"
            r0.append(r1)
            java.lang.String r1 = r3.messageId
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", extra='"
            r0.append(r2)
            java.lang.String r2 = r3.extra
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", message='"
            r0.append(r2)
            java.lang.String r2 = r3.message
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", contentType='"
            r0.append(r2)
            java.lang.String r2 = r3.contentType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", title='"
            r0.append(r2)
            java.lang.String r2 = r3.title
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", senderId='"
            r0.append(r2)
            java.lang.String r2 = r3.senderId
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", appId='"
            r0.append(r2)
            java.lang.String r2 = r3.appId
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", platform='"
            r0.append(r2)
            byte r2 = r3.platform
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
