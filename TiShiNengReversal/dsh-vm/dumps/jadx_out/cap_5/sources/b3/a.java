package b3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(com.tsn.chat.model.ResponseMessage r5) {
            java.lang.String r0 = "type"
            byte r1 = r5.getControlType()
            r2 = 50
            if (r1 != r2) goto L11
            a3.b r2 = a3.a.a()
            r2.f()
        L11:
            r2 = 51
            if (r1 != r2) goto L2c
            java.lang.String r2 = r5.getDatas()
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parse(r2)
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            a3.b r3 = a3.a.a()
            java.lang.String r4 = "messageId"
            java.lang.String r2 = r2.getString(r4)
            r3.e(r2)
        L2c:
            r2 = 52
            if (r1 != r2) goto Lb6
            com.tsn.chat.model.ChatModel r2 = new com.tsn.chat.model.ChatModel
            r2.<init>()
            java.lang.String r5 = r5.getDatas()
            java.lang.Object r5 = com.alibaba.fastjson.JSON.parse(r5)
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            java.lang.String r3 = com.tsn.chat.utils.a.c()     // Catch: java.lang.Exception -> Lb1
            r2.setCreateTime(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "schoolId"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setSchoolId(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "toUserId"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setToUserId(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "toUserName"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setToUserName(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "fromUserId"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setFromUserId(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "fromUserName"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setFromUserName(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "msg"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setMsg(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = r5.getString(r0)     // Catch: java.lang.Exception -> Lb1
            r2.setType(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "photo"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> Lb1
            r2.setPhoto(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "1"
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Exception -> Lb1
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto La0
            a3.b r5 = a3.a.a()     // Catch: java.lang.Exception -> Lb1
            r5.c(r2)     // Catch: java.lang.Exception -> Lb1
            goto Lb6
        La0:
            java.lang.String r0 = "groupId"
            java.lang.String r5 = r5.getString(r0)     // Catch: java.lang.Exception -> Lb1
            r2.setGroupId(r5)     // Catch: java.lang.Exception -> Lb1
            a3.b r5 = a3.a.a()     // Catch: java.lang.Exception -> Lb1
            r5.j(r2)     // Catch: java.lang.Exception -> Lb1
            goto Lb6
        Lb1:
            java.io.PrintStream r5 = java.lang.System.out
            r5.getClass()
        Lb6:
            r5 = 53
            if (r1 != r5) goto Lc1
            a3.b r5 = a3.a.a()
            r5.b()
        Lc1:
            return
    }
}
