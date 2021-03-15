/**
 * 状态模式，将程序中状态与状态有关的多种行为提取到不同的状态对象中，其意图是让一个对象在其内部状态改变的时候
 * 假设状态为以下几种变化：
 * new -> approving -> approved
 * new -> approving -> rejected
 * rejected -> approving -> approved
 * rejected -> approving -> rejected
 */
package behave.state;