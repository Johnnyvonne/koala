/**
 * jdk自带观察者模式
 * 它有一些缺点：
 * 1、java.util.Observable是一个Class，如果你继承它，就无法继承其他类。
 *  这限制了Observable的复用能力（增加复用能力是设计模式的目的）
 * 2、setChanged()方法被保护起来，除非你继承Observable，否则你无法创建Observable实例并组合到你的对象中，
 *  这违反了设计原则“多用组合，少用继承”
 */
package nature.wildcode.koala.observer.jdk;