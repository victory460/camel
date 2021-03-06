/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sqs;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Sqs2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sqs2Endpoint target = (Sqs2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonawshost":
        case "amazonAWSHost": target.getConfiguration().setAmazonAWSHost(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsqsclient":
        case "amazonSQSClient": target.getConfiguration().setAmazonSQSClient(property(camelContext, software.amazon.awssdk.services.sqs.SqsClient.class, value)); return true;
        case "attributenames":
        case "attributeNames": target.getConfiguration().setAttributeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreatequeue":
        case "autoCreateQueue": target.getConfiguration().setAutoCreateQueue(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "defaultvisibilitytimeout":
        case "defaultVisibilityTimeout": target.getConfiguration().setDefaultVisibilityTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "delayqueue":
        case "delayQueue": target.getConfiguration().setDelayQueue(property(camelContext, boolean.class, value)); return true;
        case "delayseconds":
        case "delaySeconds": target.getConfiguration().setDelaySeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteiffiltered":
        case "deleteIfFiltered": target.getConfiguration().setDeleteIfFiltered(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "extendmessagevisibility":
        case "extendMessageVisibility": target.getConfiguration().setExtendMessageVisibility(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "kmsdatakeyreuseperiodseconds":
        case "kmsDataKeyReusePeriodSeconds": target.getConfiguration().setKmsDataKeyReusePeriodSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": target.getConfiguration().setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "maximummessagesize":
        case "maximumMessageSize": target.getConfiguration().setMaximumMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "messageattributenames":
        case "messageAttributeNames": target.getConfiguration().setMessageAttributeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "messagededuplicationidstrategy":
        case "messageDeduplicationIdStrategy": target.getConfiguration().setMessageDeduplicationIdStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "messagegroupidstrategy":
        case "messageGroupIdStrategy": target.getConfiguration().setMessageGroupIdStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "messageretentionperiod":
        case "messageRetentionPeriod": target.getConfiguration().setMessageRetentionPeriod(property(camelContext, java.lang.Integer.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.sqs.Sqs2Operations.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "protocol": target.getConfiguration().setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueownerawsaccountid":
        case "queueOwnerAWSAccountId": target.getConfiguration().setQueueOwnerAWSAccountId(property(camelContext, java.lang.String.class, value)); return true;
        case "queueurl":
        case "queueUrl": target.getConfiguration().setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "receivemessagewaittimeseconds":
        case "receiveMessageWaitTimeSeconds": target.getConfiguration().setReceiveMessageWaitTimeSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "redrivepolicy":
        case "redrivePolicy": target.getConfiguration().setRedrivePolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": target.getConfiguration().setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "visibilitytimeout":
        case "visibilityTimeout": target.getConfiguration().setVisibilityTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "waittimeseconds":
        case "waitTimeSeconds": target.getConfiguration().setWaitTimeSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

}

