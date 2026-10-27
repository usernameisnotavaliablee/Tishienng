package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NotificationMessage implements java.io.Serializable {
    public java.lang.String _webPagePath;
    public java.lang.String appId;
    public java.lang.String appkey;
    public android.content.Context context;
    public java.lang.String deeplink;
    public java.lang.String developerArg0;
    public java.lang.String displayForeground;
    public int failedAction;
    public java.lang.String failedLink;
    public java.lang.String inAppClickAction;
    public java.lang.String inAppExtras;
    public java.lang.String inAppMsgContentBody;
    public int inAppMsgShowPos;
    public int inAppMsgShowType;
    public java.lang.String inAppMsgTitle;
    public int inAppMsgType;
    public java.lang.String inAppShowTarget;
    public int inAppType;
    public boolean isRichPush;
    public boolean isWmDeepLink;
    public java.lang.String msgId;
    public int notificationAlertType;
    public java.lang.String notificationBigPicPath;
    public java.lang.String notificationBigText;
    public int notificationBuilderId;
    public java.lang.String notificationCategory;
    public java.lang.String notificationChannelId;
    public java.lang.String notificationContent;
    public java.lang.String notificationExtras;
    public int notificationId;
    public int notificationImportance;
    public java.lang.String notificationInbox;
    public java.lang.String notificationLargeIcon;
    public java.lang.String notificationNormalSmallIcon;
    public int notificationPriority;
    public java.lang.String notificationSmallIcon;
    public int notificationStyle;
    public org.json.JSONArray notificationTargetEvent;
    public java.lang.String notificationTitle;
    public int notificationType;
    public int platform;
    public int richType;
    public java.util.ArrayList<java.lang.String> showResourceList;
    public java.lang.String sspWmOriginId;
    public int sspWmType;
    public java.lang.String sspWxAppId;
    public java.lang.String targetPkgName;

    public NotificationMessage() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.platform = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.showResourceList = r1
            r2.isWmDeepLink = r0
            r1 = 1
            r2.inAppMsgType = r1
            r1 = 2
            r2.inAppMsgShowType = r1
            r2.inAppMsgShowPos = r0
            java.lang.String r0 = ""
            r2.inAppMsgTitle = r0
            r2.inAppMsgContentBody = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NotificationMessage{notificationId="
            r0.append(r1)
            int r1 = r3.notificationId
            r0.append(r1)
            java.lang.String r1 = ", msgId='"
            r0.append(r1)
            java.lang.String r1 = r3.msgId
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", appkey='"
            r0.append(r2)
            java.lang.String r2 = r3.appkey
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationContent='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationContent
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationAlertType="
            r0.append(r2)
            int r2 = r3.notificationAlertType
            r0.append(r2)
            java.lang.String r2 = ", notificationTitle='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationTitle
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationSmallIcon='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationSmallIcon
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationLargeIcon='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationLargeIcon
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationExtras='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationExtras
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationStyle="
            r0.append(r2)
            int r2 = r3.notificationStyle
            r0.append(r2)
            java.lang.String r2 = ", notificationBuilderId="
            r0.append(r2)
            int r2 = r3.notificationBuilderId
            r0.append(r2)
            java.lang.String r2 = ", notificationBigText='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationBigText
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationBigPicPath='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationBigPicPath
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationInbox='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationInbox
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationPriority="
            r0.append(r2)
            int r2 = r3.notificationPriority
            r0.append(r2)
            java.lang.String r2 = ", notificationImportance="
            r0.append(r2)
            int r2 = r3.notificationImportance
            r0.append(r2)
            java.lang.String r2 = ", notificationCategory='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationCategory
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", developerArg0='"
            r0.append(r2)
            java.lang.String r2 = r3.developerArg0
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", platform="
            r0.append(r2)
            int r2 = r3.platform
            r0.append(r2)
            java.lang.String r2 = ", notificationChannelId='"
            r0.append(r2)
            java.lang.String r2 = r3.notificationChannelId
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", displayForeground='"
            r0.append(r2)
            java.lang.String r2 = r3.displayForeground
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", notificationType="
            r0.append(r2)
            int r2 = r3.notificationType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", inAppMsgType="
            r0.append(r2)
            int r2 = r3.inAppMsgType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", inAppMsgShowType="
            r0.append(r2)
            int r2 = r3.inAppMsgShowType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", inAppMsgShowPos="
            r0.append(r2)
            int r2 = r3.inAppMsgShowPos
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", inAppMsgTitle="
            r0.append(r1)
            java.lang.String r1 = r3.inAppMsgTitle
            r0.append(r1)
            java.lang.String r1 = ", inAppMsgContentBody="
            r0.append(r1)
            java.lang.String r1 = r3.inAppMsgContentBody
            r0.append(r1)
            java.lang.String r1 = ", inAppType="
            r0.append(r1)
            int r1 = r3.inAppType
            r0.append(r1)
            java.lang.String r1 = ", inAppShowTarget="
            r0.append(r1)
            java.lang.String r1 = r3.inAppShowTarget
            r0.append(r1)
            java.lang.String r1 = ", inAppClickAction="
            r0.append(r1)
            java.lang.String r1 = r3.inAppClickAction
            r0.append(r1)
            java.lang.String r1 = ", inAppExtras="
            r0.append(r1)
            java.lang.String r1 = r3.inAppExtras
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
