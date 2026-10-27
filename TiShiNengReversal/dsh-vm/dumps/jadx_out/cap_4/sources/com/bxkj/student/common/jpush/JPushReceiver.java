package com.bxkj.student.common.jpush;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class JPushReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String a = "JPush";

    public JPushReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(android.os.Bundle r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r1 = r9.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "cn.jpush.android.NOTIFICATION_ID"
            boolean r3 = r2.equals(r3)
            java.lang.String r4 = ", value:"
            java.lang.String r5 = "\nkey:"
            if (r3 == 0) goto L42
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            int r2 = r9.getInt(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            goto Ld
        L42:
            java.lang.String r3 = "cn.jpush.android.CONNECTION_CHANGE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            boolean r2 = r9.getBoolean(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            goto Ld
        L67:
            java.lang.String r3 = "cn.jpush.android.EXTRA"
            boolean r6 = r2.equals(r3)
            if (r6 == 0) goto Ld3
            java.lang.String r4 = r9.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L87
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "This message has no Extra data"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "JPush"
            com.orhanobut.logger.j.g(r3, r2)
            goto Ld
        L87:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld0
            java.lang.String r3 = r9.getString(r3)     // Catch: org.json.JSONException -> Ld0
            r4.<init>(r3)     // Catch: org.json.JSONException -> Ld0
            java.util.Iterator r3 = r4.keys()     // Catch: org.json.JSONException -> Ld0
        L94:
            boolean r6 = r3.hasNext()     // Catch: org.json.JSONException -> Ld0
            if (r6 == 0) goto Ld
            java.lang.Object r6 = r3.next()     // Catch: org.json.JSONException -> Ld0
            java.lang.String r6 = (java.lang.String) r6     // Catch: org.json.JSONException -> Ld0
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> Ld0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Ld0
            r7.<init>()     // Catch: org.json.JSONException -> Ld0
            r7.append(r5)     // Catch: org.json.JSONException -> Ld0
            r7.append(r2)     // Catch: org.json.JSONException -> Ld0
            java.lang.String r8 = ", value: ["
            r7.append(r8)     // Catch: org.json.JSONException -> Ld0
            r7.append(r6)     // Catch: org.json.JSONException -> Ld0
            java.lang.String r8 = " - "
            r7.append(r8)     // Catch: org.json.JSONException -> Ld0
            java.lang.String r6 = r4.optString(r6)     // Catch: org.json.JSONException -> Ld0
            r7.append(r6)     // Catch: org.json.JSONException -> Ld0
            java.lang.String r6 = "]"
            r7.append(r6)     // Catch: org.json.JSONException -> Ld0
            java.lang.String r6 = r7.toString()     // Catch: org.json.JSONException -> Ld0
            r0.append(r6)     // Catch: org.json.JSONException -> Ld0
            goto L94
        Ld0:
            goto Ld
        Ld3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r9.getString(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            goto Ld
        Lf1:
            java.lang.String r9 = r0.toString()
            return r9
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r17, android.content.Intent r18) {
            r16 = this;
            r0 = r17
            java.lang.String r1 = "groupId"
            java.lang.String r2 = "userId"
            java.lang.String r3 = "chatType"
            java.lang.String r4 = "85"
            java.lang.String r5 = "cn.jpush.android.EXTRA"
            android.os.Bundle r6 = r18.getExtras()     // Catch: java.lang.Throwable -> L2b6
            r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            a(r6)     // Catch: java.lang.Throwable -> L2b6
            java.lang.String r7 = "cn.jpush.android.intent.REGISTRATION"
            java.lang.String r8 = r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L2b6
            if (r7 == 0) goto L29
            java.lang.String r0 = "cn.jpush.android.REGISTRATION_ID"
            r6.getString(r0)     // Catch: java.lang.Throwable -> L2b6
            goto L2b6
        L29:
            java.lang.String r7 = "cn.jpush.android.intent.MESSAGE_RECEIVED"
            java.lang.String r8 = r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L2b6
            if (r7 == 0) goto L3c
            java.lang.String r0 = "cn.jpush.android.MESSAGE"
            r6.getString(r0)     // Catch: java.lang.Throwable -> L2b6
            goto L2b6
        L3c:
            java.lang.String r7 = r6.getString(r5)     // Catch: java.lang.Throwable -> L2b6
            java.lang.String r8 = "cn.jpush.android.intent.NOTIFICATION_RECEIVED"
            java.lang.String r9 = r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L2b6
            java.lang.String r9 = "0"
            java.lang.Class<com.bxkj.student.personal.customer.ContactCustomerActivity> r10 = com.bxkj.student.personal.customer.ContactCustomerActivity.class
            java.lang.String r11 = "1"
            java.lang.Class<com.bxkj.student.MainActivity> r12 = com.bxkj.student.MainActivity.class
            java.lang.String r13 = "type"
            if (r8 == 0) goto Lb3
            java.lang.String r0 = "cn.jpush.android.NOTIFICATION_ID"
            r6.getInt(r0)     // Catch: java.lang.Throwable -> L2b6
            boolean r0 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L2b6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b6
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L2b6
            boolean r1 = r0.has(r13)     // Catch: java.lang.Throwable -> L2b6
            if (r1 == 0) goto L2b6
            java.lang.String r1 = r0.getString(r13)     // Catch: java.lang.Throwable -> L2b6
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Throwable -> L2b6
            if (r1 == 0) goto L98
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()     // Catch: java.lang.Throwable -> L2b6
            android.app.Activity r0 = r0.getActivity(r10)     // Catch: java.lang.Throwable -> L2b6
            com.bxkj.student.personal.customer.ContactCustomerActivity r0 = (com.bxkj.student.personal.customer.ContactCustomerActivity) r0     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L85
            r0.x0()     // Catch: java.lang.Throwable -> L2b6
        L85:
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()     // Catch: java.lang.Throwable -> L2b6
            java.lang.Class<com.bxkj.student.main.MyFragment> r1 = com.bxkj.student.main.MyFragment.class
            androidx.fragment.app.Fragment r0 = r0.o(r1)     // Catch: java.lang.Throwable -> L2b6
            com.bxkj.student.main.MyFragment r0 = (com.bxkj.student.main.MyFragment) r0     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L2b6
            r0.Z()     // Catch: java.lang.Throwable -> L2b6
            goto L2b6
        L98:
            java.lang.String r0 = r0.getString(r13)     // Catch: java.lang.Throwable -> L2b6
            boolean r0 = r9.equals(r0)     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L2b6
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()     // Catch: java.lang.Throwable -> L2b6
            android.app.Activity r0 = r0.getActivity(r12)     // Catch: java.lang.Throwable -> L2b6
            com.bxkj.student.MainActivity r0 = (com.bxkj.student.MainActivity) r0     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L2b6
            r0.y0()     // Catch: java.lang.Throwable -> L2b6
            goto L2b6
        Lb3:
            java.lang.String r5 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            java.lang.String r8 = r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L2b6
            if (r5 == 0) goto L28c
            android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2b6
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b6
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L2b6
            com.orhanobut.logger.j.h(r7)     // Catch: java.lang.Throwable -> L2b6
            boolean r7 = r5.has(r13)     // Catch: java.lang.Throwable -> L2b6
            java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r8 = com.bxkj.base.webview.H5DetailActivity.class
            java.lang.String r14 = "title"
            java.lang.String r15 = "url"
            if (r7 == 0) goto L215
            java.lang.String r7 = r5.getString(r13)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r9 = 335544320(0x14000000, float:6.4623485E-27)
            if (r7 == 0) goto L106
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r2 = r5.has(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 == 0) goto Lfb
            java.lang.String r2 = r5.getString(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r6.putString(r15, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r5.getString(r14)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r6.putString(r14, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
        Lfb:
            r1.putExtras(r6)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.setFlags(r9)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L106:
            java.lang.String r7 = r5.getString(r13)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r7 = r11.equals(r7)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r7 == 0) goto L120
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.<init>(r0, r10)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.putExtras(r6)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.setFlags(r9)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L120:
            java.lang.String r7 = "2"
            java.lang.String r8 = r5.getString(r13)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r7 == 0) goto L1bd
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.<init>()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.putExtras(r6)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.setFlags(r9)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r2 = r2.isLogin()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 != 0) goto L14a
            android.content.Intent r1 = r1.setClass(r0, r12)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L14a:
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r3 = "7"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 != 0) goto L1b2
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 != 0) goto L1b2
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 != 0) goto L1b2
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r3 = "130"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 != 0) goto L1b2
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r3 = "78"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 != 0) goto L1b2
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r3 = "97"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r2 == 0) goto L1a7
            goto L1b2
        L1a7:
            java.lang.Class<com.bxkj.student.home.teaching.rollcall.BleSignActivity> r2 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.class
            android.content.Intent r1 = r1.setClass(r0, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L1b2:
            java.lang.Class<com.bxkj.student.home.teaching.rollcall.term.ViewTermActivity> r2 = com.bxkj.student.home.teaching.rollcall.term.ViewTermActivity.class
            android.content.Intent r1 = r1.setClass(r0, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L1bd:
            java.lang.String r4 = "3"
            java.lang.String r6 = r5.getString(r13)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r4 == 0) goto L2b6
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6
            r4.<init>()     // Catch: java.lang.Throwable -> L2b6
            com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6
            boolean r6 = r6.isLogin()     // Catch: java.lang.Throwable -> L2b6
            if (r6 == 0) goto L1de
            java.lang.Class<com.bxkj.base.chat.ChatActivity> r6 = com.bxkj.base.chat.ChatActivity.class
            r4.setClass(r0, r6)     // Catch: java.lang.Throwable -> L2b6
            goto L1e5
        L1de:
            android.content.Intent r6 = r4.setClass(r0, r12)     // Catch: java.lang.Throwable -> L2b6
            r0.startActivity(r6)     // Catch: java.lang.Throwable -> L2b6
        L1e5:
            java.lang.String r6 = "chatName"
            java.lang.String r7 = "fromName"
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L2b6
            r4.putExtra(r6, r7)     // Catch: java.lang.Throwable -> L2b6
            java.lang.String r6 = r5.getString(r3)     // Catch: java.lang.Throwable -> L2b6
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L2b6
            r4.putExtra(r3, r6)     // Catch: java.lang.Throwable -> L2b6
            r3 = 1
            if (r6 != r3) goto L206
            java.lang.String r1 = r5.getString(r2)     // Catch: java.lang.Throwable -> L2b6
            r4.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L2b6
            goto L20d
        L206:
            java.lang.String r2 = r5.getString(r1)     // Catch: java.lang.Throwable -> L2b6
            r4.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L2b6
        L20d:
            r4.setFlags(r9)     // Catch: java.lang.Throwable -> L2b6
            r0.startActivity(r4)     // Catch: java.lang.Throwable -> L2b6
            goto L2b6
        L215:
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            int r1 = r1.getSysType()     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r2 = 2
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r1 != r2) goto L259
            boolean r1 = r5.has(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r1 == 0) goto L248
            java.lang.String r1 = r5.getString(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r1 != 0) goto L248
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.Class<com.bxkj.student.v2.ui.h5.H5AppActivity> r2 = com.bxkj.student.v2.ui.h5.H5AppActivity.class
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r5.getString(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r6.putString(r15, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r5.getString(r14)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r6.putString(r14, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L24f
        L248:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.Class<com.bxkj.student.v2.ui.MainActivity> r2 = com.bxkj.student.v2.ui.MainActivity.class
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
        L24f:
            r1.putExtras(r6)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.setFlags(r3)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L259:
            boolean r1 = r5.has(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r1 == 0) goto L27d
            java.lang.String r1 = r5.getString(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            if (r1 != 0) goto L27d
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r5.getString(r15)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r6.putString(r15, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            java.lang.String r2 = r5.getString(r14)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r6.putString(r14, r2)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L282
        L27d:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.<init>(r0, r12)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
        L282:
            r1.putExtras(r6)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r1.setFlags(r3)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L2b6 java.lang.Throwable -> L2b6
            goto L2b6
        L28c:
            java.lang.String r0 = "cn.jpush.android.intent.ACTION_RICHPUSH_CALLBACK"
            java.lang.String r1 = r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L299
            goto L2b6
        L299:
            java.lang.String r0 = "cn.jpush.android.intent.CONNECTION"
            java.lang.String r1 = r18.getAction()     // Catch: java.lang.Throwable -> L2b6
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2b6
            if (r0 == 0) goto L2b1
            java.lang.String r0 = "cn.jpush.android.CONNECTION_CHANGE"
            r1 = 0
            r2 = r18
            r2.getBooleanExtra(r0, r1)     // Catch: java.lang.Throwable -> L2b6
            r2.getAction()     // Catch: java.lang.Throwable -> L2b6
            goto L2b6
        L2b1:
            r2 = r18
            r2.getAction()     // Catch: java.lang.Throwable -> L2b6
        L2b6:
            return
    }
}
