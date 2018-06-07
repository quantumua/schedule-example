# schedule-example

Example of scheduling with Spring using declarative and programmatic way

Results:

a) Spring used single-thread executor for all @Scheduled methods

b) Default executor can be changed by implementing custom TaskScheduler

c) Using several scheduler executors are possible only in programmatic way

TODO: Implement PriorityBased task scheduling

References:

1. http://www.baeldung.com/spring-task-scheduler
2. http://www.baeldung.com/java-priority-job-schedule