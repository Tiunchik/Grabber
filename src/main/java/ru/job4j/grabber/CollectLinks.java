/**
 * Package ru.job4j.parsersqlsite for
 *
 * @author Maksim Tiunchik
 */
package ru.job4j.grabber;

import java.util.List;

/**
 * Interface CollectLinks - 
 *
 * @author Maksim Tiunchik (senebh@gmail.com)
 * @version 0.1
 * @since 27.02.2020
 */
public interface CollectLinks {

    List<String> parsePage(String url);

}
